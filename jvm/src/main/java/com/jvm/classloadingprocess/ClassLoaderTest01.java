package com.jvm.classloadingprocess;

/**
 * @author sdong
 * @description TODO
 * @date 2022/3/3 0:01
 */
public class ClassLoaderTest01 {

    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(systemClassLoader);

        //获取其上层，拓展类加载器
        //sun.misc.Launcher$ExtClassLoader@7440e464
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        //获取其上层，引导类加载器
        //null
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        //对于用户自定义类来说：默认使用系统类加载器加载
        ClassLoader classLoader = ClassLoaderTest01.class.getClassLoader();
        System.out.println(classLoader);


        //引导类加载器--》Java的核心类库都是使用引导类加载器加载的
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
