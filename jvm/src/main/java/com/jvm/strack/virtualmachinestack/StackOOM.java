package com.jvm.strack.virtualmachinestack;

/**
 * @author sdong
 * @date 2022/3/3
 * <p>
 * 默认：11418
 * -Xss128k： 975
 */
public class StackOOM {

    private static int count = 0;


    public static void main(String args[]) {
        System.out.println(count);
        count++;
        main(args);
    }
}
