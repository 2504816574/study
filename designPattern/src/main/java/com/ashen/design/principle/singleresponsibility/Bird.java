package com.ashen.design.principle.singleresponsibility;

/**
 * 1.执行职责变多，风险变大（对象级别）
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else{
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
