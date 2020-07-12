package com.wf.defaultmethod;

/**
 * @Author: wangfa
 * @Date: 2020/7/11 19:18
 * @Description:
 */
public interface MyInterface02 {

    default void myDefaultMethod(){
        System.out.println("MyInterface02  myDefaultMethod");
    }
}
