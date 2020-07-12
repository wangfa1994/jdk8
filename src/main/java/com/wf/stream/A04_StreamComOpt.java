package com.wf.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: wangfa
 * @Date: 2020/7/12 16:20
 * @Description: Stream 常用方法
 * Collectors 辅助方法
 */
public class A04_StreamComOpt {

    public static void main(String[] args) {

        System.out.println("==============Collectors.toCollection");
        // 可以指定我们生成的List对象
        Stream<String> stream = Stream.of("fafa", "qiuqiu", "huahua", "fafa");
        LinkedList<String> collect = stream.collect(Collectors.toCollection(LinkedList::new));
        System.out.println(collect);

        System.out.println("=====================Collectors.toCollection");
        Stream<String> stream1 = Stream.of("fafa", "qiuqiu", "huahua", "fafa");
        HashSet<String> collect1 = stream1.collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect1);

        System.out.println("=====================Stream.collect");
        Stream<String> stream2 = Stream.of("fafa", "qiuqiu", "huahua", "fafa");
        String s = stream2.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(s);

        System.out.println("=====================Collectors.joining");
        Stream<String> stream3 = Stream.of("fafa", "qiuqiu", "huahua", "fafa");
        String s1 = stream3.collect(Collectors.joining());
        System.out.println(s1);

        System.out.println("=====================Stream.map");
        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5);
        List<Integer> collect2 = stream4.map(item -> item * item).collect(Collectors.toList());
        System.out.println(collect2);

        System.out.println("=====================Stream.flatMap");
        List<List<Integer>> listAll = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1); listAll.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);list2.add(3);listAll.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);list3.add(5);listAll.add(list3);
        Stream<List<Integer>> stream5 = listAll.stream();

        //Stream<List<Integer>> stream5 = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5));
        // flatMap 接收一个参数Function参数，Function接收两个参数，并且返回为一个Stream流

        // 接收一个List<List>的参数,然后会扁平化对应的List ,把多个List合并成一个List
        ArrayList<Integer> collect3 = stream5.flatMap(itemList -> {
            return itemList.stream();
        }).map(item -> item * item).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(collect3);



        System.out.println("===================Stream.flatMap");
        Stream<Integer> stream6 = list3.stream();
        ArrayList<Integer> collect4 = stream6.flatMap(item -> {
            List<Integer> integerList = new ArrayList<>();
            integerList.add(item);
            return integerList.stream();
        }).map(item -> item * item).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(collect4);

        /**
         * map 与flatMap的区别
         * map 是把一个参数，转换为另外一个结果
         * flatMap 是把一个参数，转换为一种Stream
         */




        List<Phone> list = new ArrayList<>();
        list.add(new Phone("name1", 12));
        list.add(new Phone("name2", 13));
        list.add(new Phone("name3", 14));


    }
}
