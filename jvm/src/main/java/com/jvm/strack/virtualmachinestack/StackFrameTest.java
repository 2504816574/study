package com.jvm.strack.virtualmachinestack;

/**
 * Java方法有两种返回函数的方式，一种是正常的函数返回，使用return指令；另外一种是抛出异常。不管使用哪种方式，都会导致栈帧被弹出。
 *
 * @author sdong
 * @date 2022/3/3
 */
public class StackFrameTest {
    public static void main(String[] args) {
        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();
        System.out.println("main()正常结束");
    }

    public void method1() {
        System.out.println("method1->开始");
        method2();
        System.out.println("method1->结束");
        //System.out.println(10 / 0);
    }

    public void method2() {
        System.out.println("method2->开始");
        method3();
        System.out.println("method2->结束");
    }

    public int method3() {
        int i = 1;
        System.out.println("method3->开始");
        method4();
        System.out.println("method3->结束");
        return i;
    }

    public double method4() {
        System.out.println("method4->开始");
        double d = 4.2;
        System.out.println("method4->结束");
        return d;
    }
}
