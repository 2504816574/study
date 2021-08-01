package com.ashen.design.principle.interfacesegregation;

/**
 * 接口功能拆分 ，不必实现IAnimalAction接口中的飞功能
 */
public class Dog implements ISwimAnimalAction,IEatAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
