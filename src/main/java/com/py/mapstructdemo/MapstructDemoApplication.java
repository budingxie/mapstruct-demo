package com.py.mapstructdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * vo：前端和controller之间交互的对象
 * dto：controller和service之间交互的对象
 * do：service和dao层交互的对象
 * po：dao层到数据库之间的映射
 *
 * @author pengyou
 */
@SpringBootApplication
public class MapstructDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructDemoApplication.class, args);
    }

}
