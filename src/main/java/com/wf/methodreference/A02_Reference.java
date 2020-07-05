package com.wf.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.wf.methodreference.Dog.compareWithName;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 19:07
 * @Description: 方法引用一：   类名::静态方法名
 */
public class A02_Reference {


    public static void main(String[] args) {
        Dog dog1 = new Dog("zhangsan",19,5);
        Dog dog2 = new Dog("lisi",49,9);
        Dog dog3 = new Dog("wangwu",33,6);
        Dog dog4 = new Dog("zhaoliu",36,8);

        List<Dog> list = Arrays.asList(dog1,dog2,dog3,dog4);
        System.out.println("方法引用版本一==========================");

        list.sort((param1,param2)->{
            return Dog.compareWithName(param1,param2);
        });
        list.forEach(System.out::println);

        System.out.println("方法引用版本二==========================");
        /**
         * sort 方法需要的是两个同类型的入参，并且返回一个整型结果
         * 我们的静态方法刚好也是连个同类型的入参，并且也是返回一个整型结果
         * 编译器就会认为他们是同类型的，可以进行处理
         */
        list.sort(Dog::compareWithWeight);
        list.forEach(System.out::println);

        /**
         *
         * lamdba 表达式要用方法应用替代，需要我们刚好存在对应的方法，与lambda表达式的入参以及出参一致，
         *
         *
         */



    }
}
