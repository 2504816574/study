package com.ashen.design.pattern.creational.abstractfactory;

/**
 * Video的具体实现类
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
