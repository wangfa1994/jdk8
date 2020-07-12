package com.wf.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: wangfa
 * @Date: 2020/7/12 10:25
 * @Description: 流 java.util.stream.*
 */
public class A01_InitStream {


    /**
     * 流的三要素
     *  数据源 + 中间操作 + 终止操作
     *
     *  流操作的类别
     *  流的惰性求值，对应中间操作，
     *  流的及早求值，对应终止操作
     *
     *  一旦遇到终止操作，流就会及早求值，此时才会处理之前的一些中间操作，
     */
    public static void main(String[] args) {

        /**
         * 流的创建
         * Stream.of()
         * Arrays.stream()
         * list.stream()
         * Stream.generate
         */
        Stream<String> stream0 = Stream.of("name", "age", "weight");


        String[] phones = new String[]{"name", "age", "weight"};
        Stream<String> stream1 = Stream.of(phones);
        Stream<String> stream2 = Arrays.stream(phones);

        List<Phone> list = new ArrayList<>();
        list.add(new Phone("we",12));
        list.add(new Phone("fpx",13));
        list.add(new Phone("ig",15));
        Stream<Phone> stream = list.stream();

        //Stream.generate 返回一个没有终止的流，无线循环，一般都会配合终止操作进行使用
        Stream<String> generate = Stream.generate(() -> "hello");
//        generate.forEach(System.out::println);

        Stream<String> generateLimit = generate.limit(2);
        generateLimit.forEach(System.out::println);

        //Stream.iterate()没有终止的去针对seed执行程序逻辑
        Stream<Integer> iterate = Stream.iterate(1, item -> item + item);
        //iterate.forEach(System.out::println);

        Stream<Integer> limit = iterate.limit(5);
        limit.forEach(System.out::println);



    }
}
