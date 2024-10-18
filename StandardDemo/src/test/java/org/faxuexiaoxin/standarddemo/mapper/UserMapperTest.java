package org.faxuexiaoxin.standarddemo.mapper;

import org.faxuexiaoxin.standarddemo.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserInsert() throws InterruptedException {
        User user = new User();
        user.setUserName("王五");
        user.setUserPassword("7889");
        user.setUserPassword_("sdfs");

        int insert = userMapper.insert(user);
        System.out.println(insert);


        Thread.sleep(100000);
    }
}