package com.ashen.design.pattern.creational.singleton;

/**
 * 线程0创建但还未初始化时线程1访问，判断到已经指向地址调用会报错
 * 解决方案 ：2 静态内部类
 *
 * @author sdong
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}
