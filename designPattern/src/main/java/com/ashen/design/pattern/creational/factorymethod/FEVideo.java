package com.ashen.design.pattern.creational.factorymethod;

/**
 *
 *  抽象视频的具体实现
 */

public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
