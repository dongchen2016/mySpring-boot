package com.springBoot.service.impl;

import com.google.gson.Gson;
import com.springBoot.model.mapper.LoginMapper;
import com.springBoot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public String validUser(String userid,String password){
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("success",loginMapper.validUser(userid,password).toString());
        map.put("user",userid);
        Gson gson = new Gson();

        if(loginMapper.validUser(userid,password) > 0)
            map.put("msg","");
        map.put("msg","用户名或密码错误");
        return gson.toJson(map);
    };
}
