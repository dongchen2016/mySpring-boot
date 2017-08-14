package com.springBoot.proxyImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by madongdong on 2017/8/14.
 */
public class PublicProxy implements InvocationHandler {

    private  Object target;

    public PublicProxy(){
        super();
    };

    public PublicProxy(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("动态代理：定去程机票");
        System.out.println("动态代理：订酒店");
        Object result = method.invoke(target,args);
        System.out.println(result.toString());
        System.out.println("动态代理：订返程机票");
        System.out.println("动态代理：报销");
        return "动态代理：出差完毕";
    }
}
