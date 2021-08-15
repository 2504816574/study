package com.ashen.design.pattern.creational.prototype.abstractprototype;

/**
 * B继承了A,B也可以进行克隆
 */
public class B extends A {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
