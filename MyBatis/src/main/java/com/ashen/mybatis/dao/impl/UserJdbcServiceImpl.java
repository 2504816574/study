package com.ashen.mybatis.dao.impl;

import com.ashen.mybatis.dao.UserJdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author 董升
 * @Date 2021/10/10
 * @Version V1.0
 * @Description:
 **/
@Repository
public class UserJdbcServiceImpl implements UserJdbcService {
    @Autowired
    @Qualifier("jdbcTemplateOne")
    JdbcTemplate jdbcTemplate;



    @Override
    public List<Map<String, Object>> getAllUser() {
        String sql = "select * from User";
        return jdbcTemplate.queryForList(sql);
    }
}
