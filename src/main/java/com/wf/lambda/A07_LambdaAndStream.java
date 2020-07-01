package com.wf.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2020/6/13 22:27
 * @Description:
 */
public class A07_LambdaAndStream {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("a","b","c","d");

//        将list中的元素变成大写并输出
        list.forEach(item->{
            System.out.println(item.toUpperCase());
        });
        System.out.println("=====================stream");
        // 将list中的元素变成大写，并写入到另外一个集合中，进行输出
        List<String> list2 = new ArrayList<>();
        list.forEach(item->list2.add(item.toUpperCase()));
        list2.forEach(item-> System.out.println(item));

        // 将list中的元素变成大写，并写入到另外一个集合中，进行输出(利用流的形式)
        // 函数接口的实例化的三种方式，lambda表达式，方法引用，构造引用。
        list.stream().map(item->item.toUpperCase()).forEach(item-> System.out.println(item));

        System.out.println("=====================methodReference");
        // 方法引用 ，方法引用可以直接类使用，也可以通过对象进行使用，
        // 方法引用的判断是那个方法主要是利用了编译器的类型判断进行确定对应的方法
        //String.toUpperCase()方法的输入是调用这个方法的字符串，输出为变成大写的字符串，不要认为toUpperCase没有参数就没有输入
        list.stream().map(String::toUpperCase).forEach(System.out::println);





        /**
         * stream（）来源于Collection 接口的默认方法，而Collection接口是集合的顶级类，
         * 所以这个stream()可以认为是针对集合而产生的。该方法会返回一个流类(java.util.stream.Stream)，
         *
         * 流包括结果流和过程流，过程流返回的仍为一个流，而结果流则返回一个结果。
         * 流必须包括源流，一般情况下，调用stream()方法的集合就是源。
         *
         * map方法接收一个Function函数式接口，这个接口方法接收两个参数，一个为输入参数，一个为输出参数。
         *
         *
         *
         *
         *
         *
         */

    }
}
