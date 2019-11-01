package com.zjm.spring.security.oauth2.server.service.impl;

import com.zjm.spring.security.oauth2.server.entity.TbPermission;
import com.zjm.spring.security.oauth2.server.service.ITbPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbPermissionServiceImplTest {
    @Autowired
    ITbPermissionService permissionService;
    @Test
    public void getPermissionListTest() {
        List<TbPermission> permissionList = permissionService.getByUserId(37L);
        permissionList.forEach(tbPermission -> {
            System.out.println(tbPermission);
        });
    }

    @Test
    public void getbyid(){
        System.out.println(permissionService.getById(37));
    }
}