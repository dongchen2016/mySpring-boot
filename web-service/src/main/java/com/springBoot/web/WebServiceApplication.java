package com.springBoot.web;


import com.springBoot.dynamicDataSource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 1063:马冬冬
 * @date: 2017/08/05.
 */
@SpringBootApplication
@RestController
@EnableTransactionManagement
@Import({DynamicDataSourceRegister.class})
//@ServletComponentScan //配置druid必须加的注解，如果不加，访问页面打不开，
// filter和servlet、listener之类的需要单独进行注册才能使用，spring boot里面提供了该注解起到注册作用
public class WebServiceApplication {

    public static void main(String[] args){
        System.setProperty("spring.config.name", "WebServiceApplication");
        SpringApplication.run(WebServiceApplication.class,args);
    }

    @RequestMapping("/")
    public String index(){
        return "123";
    }
}
