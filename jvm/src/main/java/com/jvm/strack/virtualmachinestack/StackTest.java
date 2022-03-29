package com.jvm.strack.virtualmachinestack;

/**
 * @author sdong
 * @date 2022/3/3
 */
public class StackTest {
    public void methodA() {
        int i = 10;
        int j = 20;
        methodB();
    }

    public void methodB() {
        int k = 30;
        int m = 40;
    }
}
