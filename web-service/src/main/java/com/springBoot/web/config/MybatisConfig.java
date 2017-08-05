package com.springBoot.web.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @description:数据库配置
 * @author: 1063:马冬冬
 * @date: 2017/08/05.
 */
@Configuration
@ComponentScan(basePackages = {"com.springBoot"})
@PropertySource("classpath:db.properties")
@MapperScan(basePackages = {"com.springBoot.model.mapper"})
public class MybatisConfig {

    //数据源mysql
    @Bean
    @ConfigurationProperties(prefix = "datasource")
    DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
}
