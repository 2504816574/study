package java.lang;

/**
 * @author sdong
 * @date 2022/3/3
 */
public class String {

    static {
            System.out.println("自定义String加载了");
    }
    //无法执行
    //错误: 找不到或无法加载主类 .\String.class
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
