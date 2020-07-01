package com.wf.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: wangfa
 * @Date: 2020/6/13 16:40
 * @Description:
 */
public class A05_DefaultMethod {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print("---"+integer);
            }
        });


        System.out.println("\n===========");

        // 带参数类型的写法 ，将一个方法传递给另外一个方法
        list.forEach((Integer integer) -> {
            System.out.print("---"+integer);
        });


        System.out.println("\n===========");

        // 交给编译器可以给我们进行我们的类型推断， 有参数的时候，可以省略括号
        list.forEach(integer -> {
            System.out.print("---"+integer);
        });

        /**
         *
         * forEach方法 是default method ，在java8 新引入的特性，默认方法
         *
         * forEach方法 实现在Iterable接口中，而这个接口则是代表了实现了接口的类具备迭代性，
         *
         * 通过这种特性，既可以兼容老版本，也能实现新功能
         *
         * 对于foreach方法，需要传递一个行为的参数(action)，然后针对list中的每一个元素进行行为的执行。
         *
         *
         *Consumer 函数接口
         *
         * 代表接收一个参数的，并且不返回结果的操作，注意。它与其他接口的不同，Consumer 可能会修改接收的参数。
         *
         *
         *
         *
         *
         * * lambda 表达式为java添加了缺失的函数式编程特性。
         *      * 在函数式编程语言中，lambda表达式的类型是函数，但在java中，lambda表达式缺是对象，
         *      * 但是这个对象必须依附于一类特别的对象类型--函数式接口。
         *      * 其实函数式接口就是一个只有一个函数的接口，也就表明了这个对象只能存在一个函数，
         *      * 而这个函数就是在函数式编程语言中的函数
         */
    }


    /**
     *
     */
}
