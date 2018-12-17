package realm;

import com.springbootshiro.domain.User;
import com.springbootshiro.service.ILoginService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 最基础的是Realm接口，CachingRealm负责缓存处理，AuthenticationRealm负责认证，AuthorizingRealm负责授权，
* 通常自定义的Realm继承AuthorizingRealm。
* */
public class CustomShiroRealm extends AuthorizingRealm {
    private static final Logger logger = LoggerFactory.getLogger(CustomShiroRealm.class);

    @Autowired
    private ILoginService loginService;

    /**
     * @Description: Authorization 授权，即权限验证，验证某个已认证的用户是否拥有某个权限，如：
     * 1、验证某个用户是否拥有某个权限
     * 2、细粒度的验证某个用户是否对某个资源拥有某个权限
     * @Param: [principalCollection]
     * @return: org.apache.shiro.authz.AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        String userName = (String) principal.getPrimaryPrincipal();
        logger.info(userName);
        //根据身份信息从数据库中查询权限数据
        //String userName = (String) principal.getPrimaryPrincipal();
        //User user = loginService.findPermissions(userName);
        //静态数据模拟
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(Arrays.asList("role1", "role2"));
        simpleAuthorizationInfo.addStringPermissions(Arrays.asList("user:update", "user:delete:001"));
        return simpleAuthorizationInfo;
    }

    /**
     * @Description: Authentication 身份认证/登陆  验证用户是否拥有相应的身份
     * @Param: [authenticationToken]
     * @return: org.apache.shiro.authc.AuthenticationInfo
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        if (token.getPrincipal() == null) {
            return null;
        }
        logger.info(token.getPrincipal().toString());
        //根据信息从数据库中查询身份信息
        //String userName = token.getPrincipal().toString();
        //User user = loginService.findByUserName(userName);
        //静态数据模拟
        User user = new User();
        user.setUserName("ZzzLJ");
        user.setPassword("123");
        if (user == null) {
            //这里返回后会报出对应的异常
            return null;
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            return new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), getName());
        }
    }
}
