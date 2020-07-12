package com.wf.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: wangfa
 * @Date: 2020/7/12 14:53
 * @Description:
 */
public class A03_StreamOpt {

    public static void main(String[] args) {
        // Stream ->object[]
        System.out.println("==============Stream->Object[]");
        Stream<String> stream = Stream.of("fafa", "qiuqiu", "huahua");
        String[] objects = (String[]) stream.toArray(item -> new String[item]);
        Arrays.asList(objects).forEach(System.out::println);

        //String[] strings = stream.toArray(String[]::new);

        System.out.println("==============Stream->List");

        //Stream -> List
        Stream<String> listStream = Stream.of("fafa", "qiuqiu", "huahua");
        List<String> listStr = listStream.collect(Collectors.toList());
        listStr.forEach(System.out::println);

        /**
         * collect()方法 聚集，收集 ，含有方法重载，最终调用的是一个含有三个参数的重载
         *
         * 查看API
         * 第一个参数，Supplier，不接收参数，返回我最终结果的定义 R
         * 第二个参数，Function，接收两个参数(R,? super T)，不返回值，
         *          并且第一个参数，为我们第一个参数返回的结果，第二个参数为我们流中的每一个元素，对于我们流中的每一个操作进行处理
         * 第三个参数，Function，接收两个参数(R，R)，不返回值
         *          第一个参数，为我们第一个参数返回的结果R，第二个参数为我们第二个参数经过逻辑处理的参数R
         *
         *
         */
        Stream<String> streamColl = Stream.of("fafa", "qiuqiu", "huahua");
        ArrayList<String> collect = streamColl.collect(() -> new ArrayList<String>(),
                (listParam, item) -> listParam.add(item),
                (returnList, listParam) -> {
                    returnList.addAll(listParam);
                });
        System.out.println(collect);
        System.out.println("==============Stream->List2");
        Stream<String> streamColl1 = Stream.of("fafa", "qiuqiu", "huahua");
        ArrayList<String> collect1 = streamColl1.collect(() -> {
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add("init");
                    return arrayList;
                },
                (listParam, item) -> {
                    listParam.add(item);
                    listParam.add("手动添加");
                },
                (returnList, listParam) -> {
                    returnList.removeAll(listParam);
                    listParam.removeAll(returnList);
                });

        System.out.println(collect1);

        System.out.println("==============Stream->List3:method reference");
        Stream<String> streamColl2 = Stream.of("fafa", "qiuqiu", "huahua");
        List<String> asList = streamColl2.collect(ArrayList::new, ArrayList::add,
                ArrayList::addAll);
        System.out.println(asList);

        /**
         * 第三个参数好像没有起到做作用，API 介绍说，合并，但是合并什么，结果是什么，并没有给出答案
         * 请于Collections的toList对比
         */
        Stream<String> listStream3 = Stream.of("fafa", "qiuqiu", "huahua");
        List<String> listStr3 = listStream3.collect(Collectors.toList());



    }
}
