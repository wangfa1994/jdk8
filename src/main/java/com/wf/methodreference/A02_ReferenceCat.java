package com.wf.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.wf.methodreference.Cat.compareWithName;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 19:07
 * @Description: 方法引用一：   类名::静态方法名
 */
public class A02_ReferenceCat {


    public static void main(String[] args) {
        Cat cat1 = new Cat("zhangsan",19,5);
        Cat cat2 = new Cat("lisi",49,9);
        Cat cat3 = new Cat("wangwu",33,6);
        Cat cat4 = new Cat("zhaoliu",36,8);

        List<Cat> list = Arrays.asList(cat1,cat2,cat3,cat4);
        System.out.println("方法引用版本一==========================");

        list.sort((param1,param2)->{
            return Cat.compareWithName(param1,param2);
        });
        list.forEach(System.out::println);

        System.out.println("方法引用版本二==========================");
        /**
         * sort 方法需要的是两个同类型的入参，并且返回一个整型结果
         * 我们的静态方法刚好也是连个同类型的入参，并且也是返回一个整型结果
         * 编译器就会认为他们是同类型的，可以进行处理
         */
        list.sort(Cat::compareWithWeight);
        list.forEach(System.out::println);

        /**
         *
         * lamdba 表达式要用方法应用替代，需要我们刚好存在对应的方法，与lambda表达式的入参以及出参一致，
         *
         *
         */



    }
}
