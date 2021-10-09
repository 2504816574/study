package com.ashen.mybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


/**
 * @Author 董升
 * @Date 2021/10/9
 * @Version V1.0
 * @Description:
 **/

@Configuration
@MapperScan(basePackages = "com.ashen.mybatis.mapper.db02", sqlSessionFactoryRef = "db02SqlSessionFactory")
public class DataSourceConfig2 {
    @Bean(name = "db02DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db02")
    public DataSource getDateSource2() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "db02SqlSessionFactory")
    public SqlSessionFactory db02SqlSessionFactory(@Qualifier("db02DataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:com/ashen/mybatis/mapper/db02/*.xml"));
        return bean.getObject();
    }

    @Bean("db02SqlSessionTemplate")
    public SqlSessionTemplate db02SqlSessionTemplate(
            @Qualifier("db02SqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }
}
