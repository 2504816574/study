package com.jvm.classloadingprocess;



/**
 * 获取ClassLoader的途径
 * @author sdong
 * @description TODO
 * @date 2022/3/3 0:01
 */
public class ClassLoaderTest03 {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

    }
}
