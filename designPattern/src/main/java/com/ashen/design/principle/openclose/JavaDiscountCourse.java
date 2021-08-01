package com.ashen.design.principle.openclose;

/**
 * @ClassName JavaDiscountCourse
 * @Author 董升
 * @Date 2021/7/31
 * @Version V1.0
 * @Description:
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }

}
