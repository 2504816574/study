package com.jvm.classloadingprocess;

import com.sun.net.ssl.internal.ssl.Provider;
import java.net.URL;
import sun.misc.Launcher;
import sun.security.ec.CurveDB;

/**
 * @author sdong
 * @description TODO
 * @date 2022/3/3 0:01
 */
public class ClassLoaderTest02 {

    public static void main(String[] args) {
        //获取系统类加载器
        System.out.println("启动类加载器");
        //获取能被BootstrapClassLoader能加载的api路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
        //启动类加载器
        //file:/E:/Java/jdk1.8.0_152/jre/lib/resources.jar
        //file:/E:/Java/jdk1.8.0_152/jre/lib/rt.jar
        //file:/E:/Java/jdk1.8.0_152/jre/lib/sunrsasign.jar
        //file:/E:/Java/jdk1.8.0_152/jre/lib/jsse.jar
        //file:/E:/Java/jdk1.8.0_152/jre/lib/jce.jar
        //file:/E:/Java/jdk1.8.0_152/jre/lib/charsets.jar
        //file:/E:/Java/jdk1.8.0_152/jre/lib/jfr.jar
        //file:/E:/Java/jdk1.8.0_152/jre/classes
        //随便选一个类查看他的类加载器，如果是null说明是启动类加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);
        //null

        System.out.println("拓展类加载器");
        String property = System.getProperty("java.ext.dirs");
        for (String path : property.split(";")) {
            System.out.println(path);

        }
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
