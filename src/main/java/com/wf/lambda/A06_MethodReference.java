package com.wf.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2020/6/13 17:22
 * @Description: 方法引用
 */
public class A06_MethodReference {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // 函数式接口的实例可以通过 lambda表达式，方法引用，构造方法来创建

        list.forEach(integer -> {
            System.out.println(integer);
        });
        System.out.println("================");
        // 方法引用 双击冒号可以进入到实现
        list.forEach(System.out::println);
    }

}
