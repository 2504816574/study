package com.ashen.design.principle.liskovsubstitution.methodinput;

import java.util.Map;


public class Child extends Base {
    //重写
    //@Override
    //public void method(HashMap map) {
    //System.out.println("子类HashMap入参方法被执行");
    //}

    //重载
    public void method(Map map) {
        System.out.println("子类HashMap入参方法被执行");
    }
}
