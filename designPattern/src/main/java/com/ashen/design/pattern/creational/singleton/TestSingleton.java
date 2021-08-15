package com.ashen.design.pattern.creational.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author sdong
 * @date 2021/8/9
 */
public class TestSingleton {
    /**
     * 测试单例
     */
    @Test
    public void testSingleton() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
        //生成了两个对象在多线程情况下
        //Thread-0  singleton.LazySingleton@7443fabc
        //Thread-1  singleton.LazySingleton@1021500c

    }

    /**
     * 序列化反序列化对单例对象的影响
     */
    @Test
    public void testSerialization() throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);

        System.out.println(instance == newInstance);
    }

    /**
     * 反射攻击解决方案
     * @throws NoSuchMethodException
     */
    @Test
    public void test01() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }

    /**
     * 序列化反序列化对Enum单例对象的影响
     */
    @Test
    public void test02() throws IOException, ClassNotFoundException {
        EnumInstance instance=EnumInstance.getInstance();
        instance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    /**
     * 反射攻击对Enum单例影响
     * @throws NoSuchMethodException
     */
    @Test
    public void test03() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class objectClass = EnumInstance.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumInstance instance = EnumInstance.getInstance();
        EnumInstance newInstance = (EnumInstance) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }


    /**
     * 线程单例
     */
    @Test
    public void test04() {
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

    }
}
