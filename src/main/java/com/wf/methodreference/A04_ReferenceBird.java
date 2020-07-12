package com.wf.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: wangfa
 * @Date: 2020/7/11 16:15
 * @Description: 方法引用三：   类名::实例方法名
 */
public class A04_ReferenceBird {


    public static void main(String[] args) {
        Bird bird1 = new Bird("zhangsan",19,5);
        Bird bird2 = new Bird("lisi",49,9);
        Bird bird3 = new Bird("wangwu",33,6);
        Bird bird4 = new Bird("zhaoliu",36,8);

        List<Bird> list  = Arrays.asList(bird1,bird2,bird3,bird4);
        /**
         * 注意和A02的比较，
         *在A02中，实体对象model ，利用的是静态方法加两个参数的形式
         * 而在此则是利用实例方法，且注意方法是一个参数，
         *
         * 对于我们的sort方法来说，参数Comparator 是需要两个参数的，但是为什么这里一个参数就可以
         *
         * 因为我们的方法是一个实例方法，所以必定需要一个实例对象才能调用，
         * 而这个实例对象就是我们的第一个参数，而后续的参数则是我们传递进去的参数列表
         *
         */
        list.sort(Bird::compareWithName);
        list.forEach(System.out::println);

        // String中相关提供，根据实例对象调用对应的方法
        System.out.println("hello".toUpperCase());

        List<String> stringList = Arrays.asList("huahua","fafa","qiuqiu");


        // map 接收一个Function方法，需要一个入参，一个出参，而 toUpperCase则是没有参数,利用的也是类型::实例方法名形式
        List<String> collect = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());

        // String 排序，sort的Comparetor需要的两个参数，也是如此
        Collections.sort(stringList,String::compareTo);

        // 考虑System.out::println 是那种形式
        stringList.forEach(System.out::println);

    }
}
