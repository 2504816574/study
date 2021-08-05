package com.ashen.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂的具体实现
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
