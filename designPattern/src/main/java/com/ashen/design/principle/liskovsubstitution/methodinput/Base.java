package com.ashen.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * 方法入参
 * 基类
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
