package com.ashen.design.pattern.creational.abstractfactory;

/**
 * Video的具体实现类
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
