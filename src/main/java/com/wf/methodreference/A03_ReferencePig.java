package com.wf.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 21:51
 * @Description: 方法引用二：   实例对象::实例方法名
 */
public class A03_ReferencePig {

    public static void main(String[] args) {
        // 比较器对象实例
        A03_PigComparator comparator = new A03_PigComparator();

        Pig pig1 = new Pig("zhangsan",19,5);
        Pig pig2 = new Pig("lisi",49,9);
        Pig pig3 = new Pig("wangwu",33,6);
        Pig pig4 = new Pig("zhaoliu",36,8);

        List<Pig> list = Arrays.asList(pig1,pig2,pig3,pig4);

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
