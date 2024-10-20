package org.faxuexiaoxin.readwritedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.faxuexiaoxin.readwritedemo.mapper")
public class ReadWriteDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadWriteDemoApplication.class, args);
    }

}
