package org.faxuexiaoxin.simpledemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.faxuexiaoxin.simpledemo.mapper")
public class SimpleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleDemoApplication.class, args);
    }

}
