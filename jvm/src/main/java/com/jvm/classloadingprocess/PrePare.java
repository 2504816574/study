package com.jvm.classloadingprocess;

/**
 * @author sdong
 * @description TODO
 * @date 2022/3/2 23:10
 */
public class PrePare {

    /**
     * 准备阶段为0,在初始化阶段才会为1
     */
    private static int a = 1;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
