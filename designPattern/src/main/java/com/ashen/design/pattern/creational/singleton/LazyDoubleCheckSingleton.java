package com.ashen.design.pattern.creational.singleton;

/**
 * 双重检查懒汉式单例模式
 * 线程0创建但还未初始化时线程1访问，判断到已经指向地址调用会报错
 * 解决方案 ：1 加入 volatile 禁止重排序
 *
 * @author sdong
 * @date 2021/8/9
 */
public class LazyDoubleCheckSingleton {
    //volatile 禁止重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    public LazyDoubleCheckSingleton() {
        if (lazyDoubleCheckSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                //1.分配内存给这个对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                //2.初始化对象
                    //   intra-thread semantics
                //---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
            }

        }
        return lazyDoubleCheckSingleton;
    }
}
