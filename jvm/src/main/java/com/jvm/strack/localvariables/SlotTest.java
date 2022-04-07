package com.jvm.strack.localvariables;

/**
 * @author sdong
 * @date 2022/4/4
 */
public class SlotTest {
    public void localVarl() {
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localVar2() {
        {
            int a = 0;
            System.out.println(a);
        }
        //此时的就会复用a的槽位
        int b = 0;
    }
}
