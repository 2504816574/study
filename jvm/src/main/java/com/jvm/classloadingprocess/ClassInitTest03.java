package com.jvm.classloadingprocess;

/**
 * @author sdong
 * @description TODO
 * @date 2022/3/2 23:18
 */
public class ClassInitTest03 {

    static class Father {

        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        //加载 Father类,其次加载Son类。
        System.out.println(Son.B);
    }

}
