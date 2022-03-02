package com.jvm.JvmLifecycle;

/**
 *
 * @author sdong
 * @description 进程展示
 * @date 2022/3/2 21:23
 */
public class ProcessTest {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);

        System.out.println("hello");

        //在Terminal执行jps

        // PS E:\IdeaProjects\study> jps
        // 18964
        // 1160 ProcessTest
        // 17800 Jps
        // 8136 Launcher
        // 13356 Quarkus
        // 13852


        //  10s过后


        //PS E:\IdeaProjects\study> jps
        //18464 Jps
        //18964
        //8136 Launcher
        //13356 Quarkus
        //13852

    }
}
