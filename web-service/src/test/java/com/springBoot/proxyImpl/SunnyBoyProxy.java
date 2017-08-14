package com.springBoot.proxyImpl;

import com.springBoot.Impl.SunnyBoy;
import com.springBoot.IsSunnyBoy;

/**
 * Created by madongdong on 2017/8/14.
 */
public class SunnyBoyProxy implements IsSunnyBoy{

    private IsSunnyBoy target;

    public SunnyBoyProxy(IsSunnyBoy target){
        super();
        this.target = target;
    }
    public String encode(){
        System.out.println("定去程机票");
        System.out.println("订酒店");
        System.out.println(target.encode());
        System.out.println("订返程机票");
        System.out.println("报销");
        return "出差完毕";
    };
}

