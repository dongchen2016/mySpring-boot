/*
package com.springBoot.web.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

*/
/**
 * @description: druid数据库连接池，也可以通过datasource创建连接池
 * @author: 1063:马冬冬
 * @date: 2017/08/05.
 *//*

@Configuration
@ComponentScan(basePackages = {"com.springBoot"})
@PropertySource("classpath:db.properties")
@MapperScan(basePackages = {"com.springBoot.model.mapper"})
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
*/
