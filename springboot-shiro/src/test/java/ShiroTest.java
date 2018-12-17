import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

public class ShiroTest {
    private static final Logger logger = LoggerFactory.getLogger(ShiroTest.class);

    /*
     * 对应的shiro配置文件：classpath:shiro-ini.ini
     * */
    @Test
    public void iniShiroTest() {
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro-ini.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();

        /*
        1、创建token令牌，token中有用户提交的认证信息即账号和密码
        2、subject.login(token)，最终由securityManager通过Authenticator进行认证
        3、Authenticator实现ModularRealmAuthenticator调用realm从ini配置文件获取用户真实的账号和密码，
            这里使用的是IniRealm(Shiro自带）
        4、IniRealm先根据token中的账号去ini中找该账号，如果找不到则给ModularRealmAuthenticator返回null，
            如果找到匹配密码，匹配密码成功则认证通过。
        */
        AuthenticationToken token1 = new UsernamePasswordToken("123", "123");
        subject.login(token1);
        logger.info("用户token1认证状态：" + subject.isAuthenticated());
        subject.logout();
        logger.info("用户token1认证状态：" + subject.isAuthenticated());

        AuthenticationToken token2 = new UsernamePasswordToken("ZzzLJ", "123");
        try {
            subject.login(token2);
        } catch (UnknownAccountException e) {
            logger.debug("账号不存在\n");
            e.printStackTrace();
        } catch (IncorrectCredentialsException e) {
            logger.debug("输入密码错误\n");
            e.printStackTrace();
        } catch (LockedAccountException e) {
            logger.debug("帐号被锁定\n");
            e.printStackTrace();
        } catch (DisabledAccountException e) {
            logger.debug("帐号被禁用\n");
            e.printStackTrace();
        } catch (ExcessiveAttemptsException e) {
            logger.debug("登录失败次数过多\n");
            e.printStackTrace();
        } catch (ExpiredCredentialsException e) {
            logger.debug("凭证过期\n");
            e.printStackTrace();
        }
        logger.debug("用户token2认证状态：" + subject.isAuthenticated());
        subject.logout();
        logger.debug("用户token2认证状态：" + subject.isAuthenticated());
    }

    /*
     *散列算法一般用于生成一段文本的摘要信息，散列算法不可逆，将内容可以生成摘要，无法将摘要转成原始内容。
     * 散列算法常用于对密码进行散列，常用的散列算法有MD5、SHA。
     *一般散列算法需要提供一个salt（盐）与原始内容生成摘要信息，这样做的目的是为了安全性，
     * 比如：111111的md5值是：96e79218965eb72c92a549dd5a330112，拿着“96e79218965eb72c92a549dd5a330112”去md5破解网站很容易进行破解，
     * 如果要是对111111和salt（盐，一个随机数）进行散列，这样虽然密码都是111111加不同的盐会生成不同的散列值。
     * */
    @Test
    public void md5Test() {
        String md5String = new Md5Hash("123").toString();
        logger.info("md5String：" + md5String);
        String md5_salt1 = new Md5Hash("123", "1", 1).toString();
        logger.info("md5_salt1：" + md5_salt1);
        String md5_salt2 = new Md5Hash("123", "2", 1).toString();
        logger.info("md5_salt2：" + md5_salt2);
        String simpleHash = new SimpleHash("md5", "123", "1", 1).toString();
        logger.info(simpleHash);
    }

    /*
     * 加盐加密
     * */
    @Test
    public void cryptographyShiroTest() {
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro-cryptography.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();

        AuthenticationToken token = new UsernamePasswordToken("123", "123");
        subject.login(token);
        logger.info("用户认证状态：" + subject.isAuthenticated());
    }

    /*
     * 使用自定义的realm
     * */
    @Test
    public void realmTest() {
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();

        AuthenticationToken token = new UsernamePasswordToken("ZzzLJ", "123");
        subject.login(token);
        logger.info("用户认证状态：" + subject.isAuthenticated());
        //用户授权检测，基于角色检测
        logger.info("用户是否拥有某一个角色：" + subject.hasRole("role1"));
        logger.info("用户是否拥有多个个角色：" + subject.hasAllRoles(Arrays.asList("role1", "role2")));
        //失败则抛异常    org.apache.shiro.authz.UnauthorizedException: Subject does not have role [.....]
        subject.checkRole("role1");
        subject.checkRoles("role1", "role2");

        //用户授权检测，基于资源检测
        logger.info("用户是否拥有某一个资源实例对应的操作权限" + subject.isPermittedAll("user:update", "user:delete:001"));
        //失败则抛异常    org.apache.shiro.authz.UnauthorizedException: Subject does not have permission [....]
        subject.checkPermissions("user:update", "user:delete:001");
    }

    /*
     * 基于角色的访问控制 Base-Role-Access-Controller
     * 基于资源实例的访问控制
     * */
    @Test
    public void customTest() {
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro-custom.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();

        AuthenticationToken token = new UsernamePasswordToken("ZzzLJ", "123");
        subject.login(token);
        logger.info("用户认证状态：" + subject.isAuthenticated());
        //用户授权检测，基于角色检测
        logger.info("用户是否拥有某一个角色：" + subject.hasRole("role1"));
        logger.info("用户是否拥有多个个角色：" + subject.hasAllRoles(Arrays.asList("role1", "role2")));
        //失败则抛异常    org.apache.shiro.authz.UnauthorizedException: Subject does not have role [.....]
        subject.checkRole("role1");
        subject.checkRoles("role1", "role2");

        //用户授权检测，基于资源检测
        logger.info("用户是否拥有某一个资源实例对应的操作权限" + subject.isPermittedAll("user:update", "user:delete:001"));
        //失败则抛异常    org.apache.shiro.authz.UnauthorizedException: Subject does not have permission [....]
        subject.checkPermissions("user:update", "user:delete:001");
    }

}
