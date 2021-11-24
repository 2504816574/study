package com.ashen.mybatis.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Author 董升
 * @Date 2021/10/10
 * @Version V1.0
 * @Description:
 **/
@Configuration
public class JdbcTemplateConfig {
    @Bean
    @Primary
    public JdbcTemplate jdbcTemplateOne(@Qualifier("db03") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }


}
