package com.ashen.design.pattern.creational.abstractfactory;

/**
 * Article手记的具体实现类JavaArticle手记
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
