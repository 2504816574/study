package com.ashen.design.principle.singleresponsibility;

/**
 * 拆分ICourse，获取课程功能
 */
public interface ICourseContent {
    String getCourseName();
    byte[] getCourseVideo();
}
