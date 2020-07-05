package com.wf.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 21:51
 * @Description: 方法引用二：   实例对象::实例方法名
 */
public class A03_Reference {

    public static void main(String[] args) {
        // 比较器对象实例
        A03_DogComparator comparator = new A03_DogComparator();

        Dog dog1 = new Dog("zhangsan",19,5);
        Dog dog2 = new Dog("lisi",49,9);
        Dog dog3 = new Dog("wangwu",33,6);
        Dog dog4 = new Dog("zhaoliu",36,8);

        List<Dog> list = Arrays.asList(dog1,dog2,dog3,dog4);

        System.out.println("==========================");
        list.sort((param1,param2)->{
            return  comparator.compareWithName(param1,param2);
        });
        list.forEach(System.out::println);

        System.out.println("==========================");

        list.sort((param1,param2)->{
            return  comparator.compareWithWeight(param1,param2);
        });
        list.forEach(System.out::println);

        System.out.println("==========================");
        list.sort(comparator::compareWithName);
        list.forEach(System.out::println);

        System.out.println("==========================");

        list.sort(comparator::compareWithWeight);
        list.forEach(System.out::println);


    }
}
