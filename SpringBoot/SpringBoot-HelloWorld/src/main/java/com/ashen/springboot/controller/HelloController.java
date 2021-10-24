package com.ashen.springboot.controller;

import com.ashen.springboot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 董升
 * @Date 2021/10/15
 * @Version V1.0
 * @Description:
 **/
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name){


        log.info("请求进来了....");
        return "Hello, Spring Boot 2!"+"你好："+name;
    }

    @Autowired
    Car car;


    @RequestMapping("/car")
    public Car car(){
        return car;
    }



}