package com.ashen.design.pattern.creational.factorymethod;

/**
 *
 *  抽象视频的具体实现
 */

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
