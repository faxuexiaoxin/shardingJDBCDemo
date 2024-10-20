package org.faxuexiaoxin.passworddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.faxuexiaoxin.passworddemo.mapper")
public class PasswordDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasswordDemoApplication.class, args);
    }

}
