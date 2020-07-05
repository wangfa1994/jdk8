package com.wf.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 19:07
 * @Description:
 */
public class A02_Reference {


    public static void main(String[] args) {
        Dog dog1 = new Dog("zhangsan",19);
        Dog dog2 = new Dog("lisi",49);
        Dog dog3 = new Dog("wangwu",33);
        Dog dog4 = new Dog("zhaoliu",36);

        List list = Arrays.asList(dog1,dog2,dog3,dog4);

        Comparator<Dog> comparator = (param1,param2)->{
          return param1.getWeight()-param2.getWeight();
        };
        list.sort(comparator);
        list.forEach(System.out::println);



    }
}
