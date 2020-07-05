package com.wf.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 19:04
 * @Description:
 */
public class A01_Reference {


    public static void main(String[] args) {

        List<String> listStr = Arrays.asList("hello","world","fafa");
            // lambda
        listStr.forEach(item -> System.out.println(item));
            // method_reference
        listStr.forEach(System.out::print);




        Dog dog1 = new Dog("zhangsan",19,5);
        Dog dog2 = new Dog("lisi",49,9);
        Dog dog3 = new Dog("wangwu",33,6);
        Dog dog4 = new Dog("zhaoliu",36,8);

        // Collections.sort 方法，需要list的对象实现Comparable接口
        List<Dog> list = Arrays.asList(dog1,dog2,dog3,dog4);
        System.out.println("传统方法Collections==========================1.2");
        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println("传统方法List==========================1.8");
        Comparator<Dog> comparator = (param1, param2)->{
            return param1.getWeight()-param2.getWeight();
        };
        list.sort(comparator);
        list.forEach(System.out::println);
    }
}
