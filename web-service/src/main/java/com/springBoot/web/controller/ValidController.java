package com.springBoot.web.controller;

import com.springBoot.exceptions.OperateDbException;
import com.springBoot.model.entity.TbUser;
import com.springBoot.model.entity.ThingsInfo;
import com.springBoot.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: 1063:马冬冬
 * @date: 2017/08/05.
 */
@RestController
@RequestMapping("/test")
public class ValidController {

    @Autowired
    private TestService testService;

    protected static final Logger log = Logger.getLogger(ValidController.class);

    @RequestMapping("/valid")
    public String validUser() {
        log.debug("开始验证用户名和密码是否正确");
        String result = testService.validUser("21201","123");
        return result;
    }

    @RequestMapping("/add")
    public String add(){
        TbUser tbUser = new TbUser();
        ThingsInfo info = new ThingsInfo();
        tbUser.setUsername("马冬冬");
        tbUser.setUserid("21202");
        tbUser.setPassword("weilai1314");

        info.setUserid("21202");
        info.setContent("123");
        info.setStartTime(new Date());
        info.setEndTime(new Date(new Date().getTime() + 24 *3600 *1000) );
        info.setLevel("1");
        log.debug(tbUser);
        log.debug(info);
        try{
            testService.addUserAndThing(tbUser,info);
        }catch (OperateDbException e){
            return e.getErrCode() + e.getErrMsg();
        }catch (Exception e){
            return "1";
        }
        return "";
    }
}
