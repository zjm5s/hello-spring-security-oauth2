package com.zjm.spring.security.oauth2.server.service.impl;

import com.zjm.spring.security.oauth2.server.entity.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbUserServiceImplTest {
    @Autowired
    TbUserServiceImpl userService;

    @Test
    public void getUserByName() {
        TbUser admin = userService.getUserByName("admin");
        assertEquals("admin",admin.getUsername());
    }
}