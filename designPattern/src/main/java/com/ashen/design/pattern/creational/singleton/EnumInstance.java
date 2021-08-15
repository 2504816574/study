package com.ashen.design.pattern.creational.singleton;

/**
 * @Author 董升
 * @Date 2021/8/14
 * @Version V1.0
 * @Description: 枚举类天然可序列化机制保证不会出现多次实例化情况
 **/
public enum EnumInstance {
    INSTANCEl;
    private Object data;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCEl;
    }
}
