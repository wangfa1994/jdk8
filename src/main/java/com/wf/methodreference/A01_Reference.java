package com.wf.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 19:04
 * @Description:
 */
public class A01_Reference {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello","world","fafa");
            // lambda
            list.forEach(item -> System.out.println(item));
            // method_reference
            list.forEach(System.out::print);
    }
}
