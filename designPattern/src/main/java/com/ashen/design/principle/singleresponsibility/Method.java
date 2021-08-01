package com.ashen.design.principle.singleresponsibility;

/**
 * 方法级别
 */
public class Method {
    /**
     * 集体更新
     *
     * @param userName
     * @param address
     */
    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "geely";
        //address = "beijing";
    }

    /**
     * 功能抽取，一个功能更新一种属性
     *
     * @param userName
     */
    private void updateUsername(String userName) {
        userName = "geely";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }


        userName = "geely";
        address = "beijing";
    }


}
