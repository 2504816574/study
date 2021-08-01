package com.ashen.design.principle.singleresponsibility;

/**
 * 实现类可以实现一个或多个接口进行组合
 */
public class CourseImpl implements ICourseManager, ICourseContent {
    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
