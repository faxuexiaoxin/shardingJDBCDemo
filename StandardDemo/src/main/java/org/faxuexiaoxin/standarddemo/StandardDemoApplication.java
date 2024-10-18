package org.faxuexiaoxin.standarddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.faxuexiaoxin.standarddemo.mapper")
public class StandardDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StandardDemoApplication.class, args);
    }

}
