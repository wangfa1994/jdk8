package com.wf.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: wangfa
 * @Date: 2020/6/25 16:28
 * @Description:
 */
public class A10_PredicateClass {

    public static void main(String[] args) {

        /**
         * Predicate 函数接口，接收一个参数，进行方法体执行，最后返回true或者false
         * Predicate 执行函数test
         * Predicate 进行符合条件的
         */
        Predicate<Integer> integerPredicate = item->item>5;

        System.out.println(integerPredicate.test(10));
        System.out.println(integerPredicate.test(3));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // 打印所有偶数
        predicateCondition(list,item->item%2==0);
        System.out.println("\n=========");
        predicateCondition(list,item->item%2!=0);
        System.out.println("\n=========");
        // 打印所有的偶数且大于5(打印所有大于5的偶数)
        predicateConditionAnd(list,item->item%2==0,item->item > 5);
        System.out.println("\n=========");
        //打印所有的偶数或者大于5的数
        predicateConditionOr(list,item->item%2==0,item->item > 5);
        System.out.println("\n=========");
        // 打印除去大于5的所有值
        predicateConditionNegate(list,item->item>5);


        /**
         *        静 态方法equals,比较两个数值的equals方法
         *        接收一个参数，并且返回与另外一个值的比较
         */

        System.out.println("\n=========");
        System.out.println("isEqual:"+Predicate.isEqual("test").test("hello"));
    }


    /**
     *  传递predicate 执行体，进行执行判断，并进行处理
     */
    static void predicateCondition(List<Integer> list, Predicate<Integer> predicate ){
        list.forEach(item->{
            if (predicate.test(item)) {
                System.out.print(item+"\t");
            }
        });
    }


    /**
     * Predicate函数接口的and方法，返回一个Predicate
     * 接收两个Predicate 进行短路逻辑与判断，与and一致
     */
    static void predicateConditionAnd(List<Integer> list,Predicate<Integer> predicate0,Predicate<Integer> predicate1){

        list.forEach(item->{
            if(predicate0.and(predicate1).test(item)){
                System.out.print(item+"\t");
            }
        });

    }

    /**
     * Predicate函数接口的or方法，返回一个Predicate
     * 接收两个Predicate 进行短路逻辑或判断，与or一致
     */
    static void predicateConditionOr(List<Integer> list,Predicate<Integer> predicate0,Predicate<Integer> predicate1){

        list.forEach(item->{
            if(predicate0.or(predicate1).test(item)){
                System.out.print(item+"\t");
            }
        });

    }


    /**
     * Predicate函数接口的negate方法，返回一个Predicate
     * 接收两个Predicate 进行非逻辑判断
     */
    static void predicateConditionNegate(List<Integer> list,Predicate<Integer> predicate){

        list.forEach(item->{
            if(predicate.negate().test(item)){
                System.out.print(item+"\t");
            }
        });

    }


}
