package com.itheima.reggie.common;


/**
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录的id
 * 继承set get方法
 * 基于线程实现
 */
public class BaseContext{
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();
    //设置值
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }
    //获取值
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
