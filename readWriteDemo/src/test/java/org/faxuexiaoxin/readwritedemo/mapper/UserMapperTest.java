package org.faxuexiaoxin.readwritedemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.faxuexiaoxin.readwritedemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    /**
     * 插入10个数据，看看是否都是路由到m0
     */
    @Test
    void testInsert() {

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUserName("faxuexiaoxin");
            user.setUserPassword_("13123");
            user.setUserPassword("agasd");
            mapper.insert(user);
        }
    }

    @Test
    void testQuery() {
        for (int i = 0; i < 10; i++) {
            QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
            userQueryWrapper.eq("userId",4674879879L);

            List<User> users = mapper.selectList(userQueryWrapper);

            System.out.println(users);
        }
    }
}