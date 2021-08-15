package com.ashen.design.pattern.creational.prototype.clone;


import java.io.Serializable;

/**
 * 饿汉式
 *
 * @author sdong
 * @date 2021/8/9
 */
public class HungrySingleton implements Serializable, Cloneable {

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 反序列化的时候会通过反射创建对象，所以测试时不是同一对象
     * 如果写了该方法
     * 当JVM从内存中反序列化地"组装"一个新对象时,就会自动调用这个 readResolve方法来返回我们指定好的对象了, 单例规则也就得到了保证.
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }

    /**
     * 重写保证原型模式为单例
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
