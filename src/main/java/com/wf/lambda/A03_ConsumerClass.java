package com.wf.lambda;

import java.util.function.Consumer;

/**
 * @Author: wangfa
 * @Date: 2020/6/21 19:06
 * @Description:
 */
public class A03_ConsumerClass {


    public static void main(String[] args) {


        /**
         *
         * Consumer 接收一个参数的处理，并且没有返回值
         * Consumer 接口的执行者accept方法
         */
        Consumer<String> consumer1 = item -> System.out.println(item+"11");
        Consumer<String> consumer2 = item -> System.out.println(item+"22");

        consumer1.accept("hello world");
        /** 因为没有返回值，所以是不能打印的，下面这种写法是错误的
        *  System.out.println(consumer.accept("hello world"));
        */

        /**
         * andThen接收一个Consumer
         * 先执行调用者的方法体，再进行执行参数的方法体
         */
        consumer1.andThen(consumer2).accept("see you ");
    }
}
