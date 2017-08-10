package com.springBoot.service.impl;

import com.springBoot.dynamicDataSource.TargetDataSource;
import com.springBoot.model.mapper.QueryMapper;
import com.springBoot.service.DynamicDateSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author: 马冬冬
 * @create: 2017/08/10
 */
@Service
public class DynamicDateSourceServiceImpl implements DynamicDateSourceService{

    @Autowired
    private QueryMapper queryMapper;

    public String getUserName(String userId){
        return queryMapper.getUserName(userId);
    }

    @TargetDataSource(name = "ds1")
    public String getUserNameDs1(String userId){
        return queryMapper.getUserName(userId);
    }

    @TargetDataSource(name = "ds2")
    public String getUserNameDs2(String userId){
        return queryMapper.getUserName(userId);
    }
}
