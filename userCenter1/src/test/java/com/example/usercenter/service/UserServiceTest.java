package com.example.usercenter.service;
import java.util.Date;

import com.example.usercenter.model.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("yupi");
        user.setUserAccount("yupidog");
        user.setAvartarUrl("http://baidu.com");
        user.setGender(0);
        user.setUserPassword("12345");
        user.setColumn_7(0);
        user.setPhone("133222444555");
        user.setEmail("133222444555@qq.com");
        user.setUserStatus(0);
        boolean result = userService.save(user);
        System.out.println(user.getId());
    }
}