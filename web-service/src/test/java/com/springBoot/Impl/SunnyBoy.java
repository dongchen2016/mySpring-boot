package com.springBoot.Impl;

import com.springBoot.IsSunnyBoy;

/**
 * Created by madongdong on 2017/8/14.
 */
public class SunnyBoy implements IsSunnyBoy{
    public String encode(){
        System.out.println("努力编码中.....");
        return "编码完成，返回公司";
    }
}
