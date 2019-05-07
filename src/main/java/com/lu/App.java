package com.lu;

import com.lu.dbconfig.DBConfig1;
import com.lu.dbconfig.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.lu")
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
