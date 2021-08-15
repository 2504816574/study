package com.ashen.design.pattern.creational.prototype.clone;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 *
 */
public class CloneTest {
    /**
     * 深克隆
     * 浅克隆
     */
    @Test
    public void test01() throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(666666666666L);

        //浅克隆的时候虽然对象不同，但是两个对象值属性仍然相同，
        System.out.println(pig1);
        System.out.println(pig2);
    }

    /**
     *原型模式和单例模式
     */
    @Test
    public void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }


}
