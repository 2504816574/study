package com.ashen.design.pattern.creational.singleton;

/**
 * 多线程中的单例模式测试
 */
public class T implements Runnable {
    @Override
    public void run() {
        //懒汉式
        //LazySingleton instance = LazySingleton.getInstance();

        //双重检查懒汉式
        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

        //静态内部类解决多线程问题
        //StaticInnerClassSingleton instance=StaticInnerClassSingleton.getInstance();

        //饿汉式
        //HungrySingleton instance = HungrySingleton.getInstance();


        //Map存储多个单例
        //ContainerSingleton.putInstance("object",new Object());
        //Object instance = ContainerSingleton.getInstance("object");

        //线程单例
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();


        System.out.println(Thread.currentThread().getName()+"  "+instance);

    }
}
