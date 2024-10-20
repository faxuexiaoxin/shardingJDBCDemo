package org.faxuexiaoxin.passworddemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.faxuexiaoxin.passworddemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsertData() {
        User user = new User();
        user.setUserPassword("123123");
        user.setUserName("插入有原文列");

        userMapper.insert(user);
    }


    @Test
    void testQuery() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("userPassword","123123");

        List<User> users = userMapper.selectList(userQueryWrapper);
        System.out.println(users);
    }
}