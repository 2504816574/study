package com.ashen.mybatis.service.impl;

import com.ashen.mybatis.entiy.User;
import com.ashen.mybatis.mapper.db01.User01Mapper;
import com.ashen.mybatis.mapper.db02.User02Mapper;
import com.ashen.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> getAllUser() {
        return user01Mapper.getAllUser();
    }

    @Override
    public List<User> getAllUser02() {
        return user02Mapper.getAllUser();
    }
}
