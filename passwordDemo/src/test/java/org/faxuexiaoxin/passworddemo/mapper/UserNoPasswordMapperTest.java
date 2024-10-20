package org.faxuexiaoxin.passworddemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.faxuexiaoxin.passworddemo.entity.UserNoPassword;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserNoPasswordMapperTest {

    @Autowired
    private UserNoPasswordMapper mapper;

    @Test
    void testInsert() {
        UserNoPassword userNoPassword = new UserNoPassword();
        userNoPassword.setUserName("只有原文列的数据");
        userNoPassword.setUserPassword("加密数据");
        mapper.insert(userNoPassword);
    }

    @Test
    void testQuery() {
        QueryWrapper<UserNoPassword> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userPassword","加密数据");
        List<UserNoPassword> userNoPasswords = mapper.selectList(queryWrapper);
        System.out.println(userNoPasswords);
    }
}