package com.ashen.mybatis.service.impl;

import com.ashen.mybatis.dao.UserJdbcService;
import com.ashen.mybatis.entiy.User;
import com.ashen.mybatis.mapper.db01.User01Mapper;
import com.ashen.mybatis.mapper.db02.User02Mapper;
import com.ashen.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author 董升
 * @Date 2021/10/9
 * @Version V1.0
 * @Description:
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    User01Mapper user01Mapper;
    @Autowired
    User02Mapper user02Mapper;
    @Autowired
    UserJdbcService userJdbcService;

    @Override
    public List<User> getAllUser() {
        return user01Mapper.getAllUser();
    }

    @Override
    public List<User> getAllUser02() {
        return user02Mapper.getAllUser();
    }

    @Override
    public List<User> getAllUser03() {
        List<Map<String, Object>> allUser = userJdbcService.getAllUser();
        List<User> users = new ArrayList<>();
        for (Map<String, Object> userMap : allUser) {
            User user = new User();
            user.setId(userMap.get("id").toString());
            user.setName(userMap.get("name").toString());
            users.add(user);
        }
        return users;
    }
}
