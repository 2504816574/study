package com.ashen.design.pattern.creational.singleton;

/**
 * 懒汉式
 * @author sdong
 * @date 2021/8/9
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
