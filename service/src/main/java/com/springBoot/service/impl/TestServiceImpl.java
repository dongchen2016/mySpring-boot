package com.springBoot.service.impl;

import com.google.gson.Gson;
import com.springBoot.exceptions.OperateDbException;
import com.springBoot.model.entity.TbUser;
import com.springBoot.model.entity.ThingsInfo;
import com.springBoot.model.mapper.LoginMapper;
import com.springBoot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.LinkedHashMap;

/**
 * @description:
 * @author: 1063:马冬冬
 * @date: 2017/08/05.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String validUser(String userid, String password) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("success", loginMapper.validUser(userid, password).toString());
        map.put("user", userid);
        Gson gson = new Gson();

        if (loginMapper.validUser(userid, password) > 0) {
            map.put("msg", "");
        } else {
            map.put("msg", "用户名或密码错误");
        }
        return gson.toJson(map);
    }

    ;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor={OperateDbException.class,Exception.class})
    public void addUserAndThing(TbUser tbUser, ThingsInfo info) throws OperateDbException {
        Integer num = loginMapper.addUser(tbUser);
        if (num < 1) {
            throw new OperateDbException("01", "插入用户表失败");
        }

        /*Integer ss = num /0;*/

        Integer count = loginMapper.addOneThing(info);
        if (count < 1){
            throw  new OperateDbException("02","插入计事表失败");
        }
    }
}
