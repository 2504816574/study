package com.ashen.design.principle.dependenceinversion;

/**
 * @ClassName
 * @Author 董升
 * @Date 2021/7/31
 * @Version V1.0
 * @Description: 课程接口
 **/
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("student在学习FE课程");
    }

}
