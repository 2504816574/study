package com.ashen.design.principle.singleresponsibility;

/**
 * （接口级别）
 */
public interface ICourse {
    //获取课程功能
    String getCourseName();

    byte[] getCourseVideo();



    //功能管理功能
    void studyCourse();

    void refundCourse();

}
