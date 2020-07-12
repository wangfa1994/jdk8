package com.wf.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @Author: wangfa
 * @Date: 2020/7/12 10:43
 * @Description: 基础类型的Stream
 */
public class A02_BaseTypeStream {


    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1,2,3,4,5,6,7);
        intStream.forEach(System.out::println);

        //range(int startInclusive, int endExclusive) 包括开始，不包括结尾
        IntStream.range(5,9);

        //rangeClosed(int startInclusive, int endInclusive) 都是闭区间
        IntStream.rangeClosed(5,9);

        /**
         * Integer 1.8 新增
         */
        int reduce = intStream.map(item -> item * 2).reduce(0, Integer::sum);
        System.out.println(reduce);

        DoubleStream doubleStream = DoubleStream.of(12,13.23);

        /**
         * 基本流给我们提供了一些基础操作，查看相关API
         *
         */

    }

}
