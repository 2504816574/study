package com.ashen.design.principle.dependenceinversion;

/**
 * @ClassName
 * @Author 董升
 * @Date 2021/7/31
 * @Version V1.0
 * @Description: 课程接口
 **/
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("studnt在学习Java课程");
    }
}
