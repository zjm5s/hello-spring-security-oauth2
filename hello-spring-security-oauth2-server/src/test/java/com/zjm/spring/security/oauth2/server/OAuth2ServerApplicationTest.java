package com.zjm.spring.security.oauth2.server;


import com.zjm.spring.security.oauth2.server.entity.TbRole;
import com.zjm.spring.security.oauth2.server.entity.TbRolePermission;
import com.zjm.spring.security.oauth2.server.service.impl.TbRolePermissionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class OAuth2ServerApplicationTest {

    @Autowired
    TbRolePermissionServiceImpl rolePermissionService;

    @Test
    public void testBCryptPasswordEncoder() {
        System.out.println(new BCryptPasswordEncoder().encode("admin888"));
    }

    @Test
    public void selectOne(){
        List<TbRolePermission> list = rolePermissionService.list();
        list.forEach(one->{
            System.out.println(one);
        });
    }
}
