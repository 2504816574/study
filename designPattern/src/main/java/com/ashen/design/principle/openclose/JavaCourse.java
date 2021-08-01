package com.ashen.design.principle.openclose;

/**
 * @ClassName JavaCourse
 * @Author 董升
 * @Date 2021/7/31
 * @Version V1.0
 * @Description: Java 封闭原则
 **/
public class JavaCourse implements ICourse{
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
