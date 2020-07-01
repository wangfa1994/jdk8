package com.wf.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: wangfa
 * @Date: 2020/6/13 15:19
 * @Description:
 */
public class A02_ListLambdaWithFunctionInterface {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (int i = 0; i < list.size(); i++) {
            System.out.print("---" + i);
        }
        System.out.println("\n========");
        for (Integer i : list) {
            System.out.print("---" + i);
        }
        System.out.println("\n========");

        /**
         * lamda 匿名内部类 Consumer 接口
         * 在进行迭代的时候，会将每一个元素进行调用匿名内部类的accept方法
         *
         * Consumer 函数式接口
         */
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print("---" + integer);
            }
        });

        System.out.println("\n========");


        /**
         * 函数式接口
         *  1.@FunctionalInterface
         * 从概念上来就讲，一个函数式接口应该有且仅有一个抽象方法，
         * 如果一个接口仅有一个抽象方法，但是还另外声明了覆盖了Object的公用抽象方法，那么他是一个函数式接口,但是这个覆盖的方法不会被记入抽象方法的数量里面。
         * 因为接口的任何实现都具备object方法。(Object 是所有类的超类)
         *
         *
         * 注意 函数式接口的实例可以通过lambda表达式，方法引用，构造方法引用进行实例
         *
         *当一个接口符合函数式接口的定义时，不管有没有进行注解@FunctionInterface的使用，编译器都会将他默认为一个函数式接口
         *
         *
         *
         * lambda 表达式的使用就是基于函数式接口
         *
         */
    }
}
