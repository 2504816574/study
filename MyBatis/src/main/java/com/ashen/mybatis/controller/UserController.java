package com.ashen.mybatis.controller;


import com.ashen.mybatis.entiy.User;
import com.ashen.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 董升
 * @Date 2021/10/9
 * @Version V1.0
 * @Description:
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user01")
    public List<User> getAllUser() {
        List<User> allUser = userService.getAllUser();
        System.out.println(Arrays.toString(allUser.toArray()));
        return allUser;
    }

    @GetMapping(value = "/user02")
    public List<User> getAllUser02() {
        List<User> allUser = userService.getAllUser02();
        System.out.println(Arrays.toString(allUser.toArray()));
        return allUser;
    }
    @GetMapping(value = "/user03")
    public List<User> getAllUser03() {
        List<User> allUser = userService.getAllUser03();
        System.out.println(Arrays.toString(allUser.toArray()));
        return allUser;
    }
}