package com.ashen.design.principle.dependenceinversion;

/**
 * @ClassName
 * @Author 董升
 * @Date 2021/7/31
 * @Version V1.0
 * @Description: 课程接口
 **/
public class Student {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;



    public void studyImoocCourse(){
        iCourse.studyCourse();
    }






}
