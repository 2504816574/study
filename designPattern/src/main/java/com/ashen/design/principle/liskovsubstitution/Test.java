package com.ashen.design.principle.liskovsubstitution;


public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("resize方法结束 width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
    }

    /**
     * 不遵信里氏替换原则，正方形是长方形的子类，正方形的resize()方法与长方形resize()方法程序逻辑不一致
     */
    //public static void main(String[] args) {
        //Rectangle rectangle = new Rectangle();
        //rectangle.setWidth(10);
        //rectangle.setLength(20);
        //resize(rectangle);
    //}

    /**
     * 遵信里氏替换原则，正方形不再是长方形的子类
     * @param args
     */
    public static void main(String[] args) {
        Square square = new Square();
        //square.setLength(10);
        //resize(square);
    }


}
