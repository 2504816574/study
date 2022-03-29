package com.jvm.classloadingprocess;

/**
 * @author sdong
 * @description TODO
 * @date 2022/3/2 23:18
 */
public class ClassInitTest02 {
    //任何一个类声明以后,内部至少存在一个类的构造器

    //1.该类无类构造器方法<clinit>(),缺少静态代码块
    private int num = 1;
    //2.放开注释重新编译会有类构造器方法<clinit>()
    private static int c = 1;

    public static void main(String[] args) {
        int b = 2;
    }
    //3.<init>()
    //public ClassInitTest02(int num) {
    //    num = 10;
    //    int d = 20;
    //}
}
