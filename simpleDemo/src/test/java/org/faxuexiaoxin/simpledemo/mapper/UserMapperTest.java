package org.faxuexiaoxin.simpledemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.faxuexiaoxin.simpledemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
//            user.setUserPassword_("fsdfsdfs");
            userMapper.insert(user);
        }
    }

    @Test
    void testFindByRange() {
        List<User> users = userMapper.selectByUserRange(1054411326039785473L, 1054411326316609537L);
        System.out.println(users);
    }

    @Test
    void testFindOne() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("userPassword","test").eq("userid",1054430871186046977L);
        User user = userMapper.selectOne(userQueryWrapper);
        System.out.println(user);
    }
}