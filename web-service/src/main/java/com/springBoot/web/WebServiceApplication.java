package com.springBoot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 1063:马冬冬
 * @date: 2017/08/05.
 */
@SpringBootApplication
@RestController
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
