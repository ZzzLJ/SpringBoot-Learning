package realm;

import com.springbootshiro.domain.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class CryptographyRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户信息
        String userName = token.getPrincipal().toString();
        User user = new User();
        user.setUserName(userName);
        user.setPassword("123");
        if (user == null) {
            //这里返回后会报出对应的异常
            return null;
        } else {
            //加盐验证
            String salt = "salt";
            SimpleAuthenticationInfo simpleAuthenticationInfo =
                    new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), ByteSource.Util.bytes(salt), getName());
            return simpleAuthenticationInfo;
        }
    }
}
