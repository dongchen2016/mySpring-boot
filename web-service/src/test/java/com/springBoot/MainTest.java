package com.springBoot;

import com.springBoot.Impl.SunnyBoy;
import com.springBoot.proxyImpl.PublicProxy;
import com.springBoot.proxyImpl.SunnyBoyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by madongdong on 2017/8/14.
 */
public class MainTest {

    public static void main(String[] args){
        IsSunnyBoy sunnyBoy = new SunnyBoy();
        SunnyBoyProxy proxy1 = new SunnyBoyProxy(sunnyBoy);
        System.out.println(proxy1.encode());

        IsSunnyBoy target = new SunnyBoy();
        InvocationHandler invocationHandler = new PublicProxy(target);
        IsSunnyBoy proxy2 = (IsSunnyBoy) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),invocationHandler);
        System.out.println(proxy2.encode());
    }
}
