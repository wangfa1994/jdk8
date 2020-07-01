package com.wf.lambda;

import javax.jws.Oneway;
import java.util.function.BiFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

/**
 * @Author: wangfa
 * @Date: 2020/6/21 18:20
 * @Description:
 */
public class A08_FunctionClass {


    public static void main(String[] args) {


        Function<Integer,Integer> function1 = item -> item * 3;
        Function<Integer,Integer> function2 = item->item+2;


        /**
         * Function的执行者apply方法
         * andThen 接收Function参数
         * 先执行调用者function的函数体，在执行参数function的函数体
         * 先执行调用者function1的函数体得出15，在执行参数function2的函数体得出17
         */
        System.out.println(function1.andThen(function2).apply(5));

        /*
        * compose 接收Function参数
        * 先执行参数function的函数体，再执行调用的函数体
        * 先执行参数function2的函数体得出7，再执行调用者function1的函数体得出21
         */
        System.out.println(function1.compose(function2).apply(5));

        /** andThen和compose 主要是执行时机不一致
         * andThen和compose 由于返回的是Function，我们可以进行无限串联，然后最后使用apply进行结果输出。
         *Function函数接口，只能输入一个参数，输出一个参数
         *
         *
         * */



        BiFunction<Integer,Integer,Integer> biFunctionAdd= (first,second) -> first + second;;
        System.out.println(biFunctionAdd.apply(1,2));

        BiFunction<Integer,Integer,Integer> biFunctionSub= (first,second) -> first - second;;
        System.out.println(biFunctionSub.apply(1,2));

        /**
         * andThen 方法 会将输出的两个参数，进行BiFunctuon的apply处理返回一个结果，
         * 然后将这个结果作为Function的一个入参，进行Function的处理，然后输入结果。
         *
         * 先进性functionBi的处理得出5，然后再进行function的处理进行拼接，输出5---->hello
         */
        BiFunction<Integer,Integer,Integer> functionBi = (first,second)->first+second;
        Function<Integer,String> function = item->item+"---->hello";

        System.out.println(functionBi.andThen(function).apply(2,3));



        /**
         * BiFunction 与Function 的区别在于，BiFunction接收两个参数，返回一个结果。
         *
         * BiFunction的andThen 接收一个Function的参数进行处理。
         */
    }
}
