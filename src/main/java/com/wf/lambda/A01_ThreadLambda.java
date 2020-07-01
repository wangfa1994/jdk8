package com.wf.lambda;

/**
 * @Author: wangfa
 * @Date: 2020/6/13 15:07
 * @Description:
 */
public class A01_ThreadLambda {
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("name:"+Thread.currentThread().getName());
        }
    });


    Thread threadL1 = new Thread(() -> System.out.println("name:"+Thread.currentThread().getName()));

    /**
     * 1.7 之前
     *  在java中，我们无法将函数作为参数传递给另外一个函数，也无法让函数返回一个函数。
     *  但是在js中，就可以将函数作为参数传递给另外一个函数，
     *
     *
     * lambda基本结构
     *
     * 参数 -> 执行体
     * (params1,params2) -> {  }
     *
     *
     *
     *
     */

}
