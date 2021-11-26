package com.ashen.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 宠物
 * @Author 董升
 * @Date 2021/10/15
 * @Version V1.0
 * @Description:
 **/
@ToString
@Data
@NoArgsConstructor  //无参构造器
@AllArgsConstructor  //全参构造器
public class Pet {
    private String name;
}
