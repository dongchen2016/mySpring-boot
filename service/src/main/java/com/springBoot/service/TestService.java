package com.springBoot.service;

import com.springBoot.exceptions.OperateDbException;
import com.springBoot.model.entity.TbUser;
import com.springBoot.model.entity.ThingsInfo;

/**
 * @description:
 * @author: 1063:马冬冬
 * @date: 2017/08/05.
 */
public interface TestService {

    /**
     * 校验用户名密码是否正确
     */
    String validUser(String userid,String password);

    /**
     * 增加新用户和事件
     */
    void addUserAndThing(TbUser tbUser, ThingsInfo info) throws OperateDbException;
}
