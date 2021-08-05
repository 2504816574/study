package com.ashen.design.pattern.creational.factorymethod;

/**
 * 抽象工厂的具体实现
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
