package com.ashen.design.pattern.structural.decorator;

/**
 * 具体构件
 * 卖煎饼
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
