package com.ashen.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂的具体实现
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
