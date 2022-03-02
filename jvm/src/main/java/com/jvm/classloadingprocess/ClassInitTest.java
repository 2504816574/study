package com.jvm.classloadingprocess;

/**
 * @author sdong
 * @description TODO
 * @date 2022/3/2 23:18
 */
public class ClassInitTest {

    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(2);

        //报错,非法的前向引用
//        System.out.println(number);
    }
    //linking之prepare:number=0 --> initialization :20-->10
    private static int number=10;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//10
    }
}
