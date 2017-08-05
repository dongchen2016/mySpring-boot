package com.springBoot.model.mapper;

import com.springBoot.model.entity.TbUser;
import com.springBoot.model.entity.ThingsInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by admin on 2017/04/03.
 */
public interface LoginMapper {
    /**
     *  验证用户名密码是否正确
     */
    Integer validUser(@Param("userid") String userid, @Param("password") String password);

    /**
     *  新增用户
     */
    Integer addUser(TbUser tbUser);

    /**
     *  新增事件
     */
    Integer addOneThing(ThingsInfo thingsInfo);
}
