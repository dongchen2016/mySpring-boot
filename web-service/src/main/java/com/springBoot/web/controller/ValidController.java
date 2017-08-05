package com.springBoot.web.controller;

import com.springBoot.model.mapper.LoginMapper;
import com.springBoot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 1063:马冬冬
 * @date: 2017/08/05.
 */

@RestController
public class ValidController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test/valid")
    public String validUser() {
        String result = testService.validUser("21201","123");
        return result;
    }
}
