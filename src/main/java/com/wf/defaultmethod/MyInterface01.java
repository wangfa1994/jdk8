package com.wf.defaultmethod;

/**
 * @Author: wangfa
 * @Date: 2020/7/11 19:17
 * @Description:
 */
public interface MyInterface01 {

    default void myDefaultMethod(){
        System.out.println("MyInterface01  myDefaultMethod");
    }
}
