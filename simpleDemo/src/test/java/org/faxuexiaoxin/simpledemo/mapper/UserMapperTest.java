package org.faxuexiaoxin.simpledemo.mapper;

import org.faxuexiaoxin.simpledemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        User user = new User();
        for (int i = 0; i < 10; i++) {
//            user.setUserid(i);
            user.setUserName("法学小心鑫");
            user.setUserPassword("test");
            user.setUserPassword_("fsdfsdfs");
            userMapper.insert(user);
        }
    }
}