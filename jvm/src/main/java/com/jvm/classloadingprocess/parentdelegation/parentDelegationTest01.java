package com.jvm.classloadingprocess.parentdelegation;

/**
 * @author sdong
 * @description TODO
 * @date 2022/3/2 23:18
 */
public class parentDelegationTest01 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadTest deadTest = new DeadTest();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread thread1 = new Thread(runnable, "线程1");
        Thread thread2 = new Thread(runnable, "线程2");
        thread1.start();
        thread2.start();
    }

}

class DeadTest {

    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            //让线程一直处于初始化状态
            while (true) {

            }
        }
    }
}