package com.jvm.strack.localvariables;

import java.util.Date;

/**
 * 局部变量表
 *
 * @author sdong
 * @date 2022/3/9
 */
public class LocalVariablesTest {
    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest localVariablesTest = new LocalVariablesTest();
        int num = 10;
        localVariablesTest.test1();

    }

    private void test1() {
        Date date = new Date();
        String hello = "hello";
        String info = test2(date, hello);
        System.out.println(date + hello);
    }

    private String test2(Date date, String hello) {
        date = null;
        hello = "hello1";
        double weight = 4.2;
        char gender = '男';
        return date + hello;

    }

    public static void testStatic() {
        LocalVariablesTest localVariablesTest = new LocalVariablesTest();
        int count = 10;
        System.out.println(count);
        //注释打开报错,因为this变量不存在于当前方法的局部变量表中
        //System.out.println(this.count);
    }
}
