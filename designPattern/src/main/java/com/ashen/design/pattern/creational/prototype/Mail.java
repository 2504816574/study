package com.ashen.design.pattern.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 董升
 * @Date 2021/8/15
 * @Version V1.0
 * @Description: 邮箱
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mail implements Cloneable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 邮箱地址
     */
    private String emailAddress;
    /**
     * 模板
     */
    private String content;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
