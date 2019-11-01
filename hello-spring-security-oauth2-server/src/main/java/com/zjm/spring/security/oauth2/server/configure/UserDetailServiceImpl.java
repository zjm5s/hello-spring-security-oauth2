package com.zjm.spring.security.oauth2.server.configure;

import com.zjm.spring.security.oauth2.server.entity.TbPermission;
import com.zjm.spring.security.oauth2.server.entity.TbUser;
import com.zjm.spring.security.oauth2.server.service.ITbPermissionService;
import com.zjm.spring.security.oauth2.server.service.ITbUserService;
import com.zjm.spring.security.oauth2.server.service.impl.TbPermissionServiceImpl;
import com.zjm.spring.security.oauth2.server.service.impl.TbUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private ITbUserService tbUserService;

    @Autowired
    private ITbPermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TbUser user = tbUserService.getUserByName(s);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (user != null) {
            List<TbPermission> permissionList = permissionService.getByUserId(user.getId());
            permissionList.forEach(tbPermission -> {
                SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(simpleGrantedAuthority);
            });
            return new User(user.getUsername(),user.getPassword(),grantedAuthorities);
        }
        return null;
    }
}
