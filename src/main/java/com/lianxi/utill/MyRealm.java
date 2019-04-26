package com.lianxi.utill;

import com.lianxi.entity.Master;
import com.lianxi.service.MasterService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

public class MyRealm extends AuthorizingRealm {
    @Resource
    private MasterService masterService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken= (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        String password = new String(usernamePasswordToken.getPassword());
        Master master = masterService.findByNumber(username);
        if(master!=null){
            if(Md5.md5(password,master.getMasterSalt()).equals(master.getMasterPassword())){
                SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(master,password,getName());
                return authenticationInfo;
            }else {
                throw new AccountException("密码错误");
            }
        }else {
            throw new UnknownAccountException("未知的账号");
        }
    }
}
