package com.springBoot.web;

import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Constants;
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
