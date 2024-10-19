package org.faxuexiaoxin.simpledemo.service;


import org.faxuexiaoxin.simpledemo.entity.User;
import org.faxuexiaoxin.simpledemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public boolean addRandomData(){
        User user = new User();
        user.setUserName("小李胖了吗");
        user.setUserPassword_(String.valueOf(new Random().nextInt()));
        user.setUserPassword(String.valueOf(new Random().nextInt()));
        int insert = mapper.insert(user);
        return insert == 1;
    }
}
