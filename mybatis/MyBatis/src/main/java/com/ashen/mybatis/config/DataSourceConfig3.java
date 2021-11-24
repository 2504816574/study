package com.ashen.mybatis.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author 董升
 * @Date 2021/10/10
 * @Version V1.0
 * @Description:
 **/
@Configuration
public class DataSourceConfig3 {
    @ConfigurationProperties(prefix = "spring.datasource.db03.druid")
    @Bean(name = "db03")
    public DataSource db01(){
        return DruidDataSourceBuilder.create().build();
    }

}
