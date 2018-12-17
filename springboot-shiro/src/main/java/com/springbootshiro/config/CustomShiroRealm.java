package com.springbootshiro.config;

import com.springbootshiro.domain.User;
import com.springbootshiro.service.ILoginService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/*
* 最基础的是org.apache.shiro.realm.Realm接口，CachingRealm负责缓存处理，AuthenticationRealm负责认证，AuthorizingRealm负责授权，
* 通常自定义的Realm继承AuthorizingRealm。
* */
public class CustomShiroRealm extends AuthorizingRealm {
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
        String name = (String) principal.getPrimaryPrincipal();

        return null;
    }

    /**
     * @Description: Authentication 身份认证/登陆  验证用户是否拥有相应的身份
     * @Param: [authenticationToken]
     * @return: org.apache.shiro.authc.AuthenticationInfo
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //加这一步的目的是在post请求的时候会先进行认证，然后再到请求
        if (token.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        String userName = token.getPrincipal().toString();
        User user = loginService.findByUserName(userName);
        if (user == null) {
            //这里返回后会报出对应的异常
            return null;
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userName, user.getPassword(), getName());
            return simpleAuthenticationInfo;
        }
    }
}
