package com.wf.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @Author: wangfa
 * @Date: 2020/6/26 15:55
 * @Description:
 */
public class A12_BinaryOperatorClass {

    /**
     *  BinaryOperator
     */
    public static void main(String[] args) {

        /**
         * BinaryOperator 继承与BiFunction，
         * 接收两个类型一致的参数，返回的类型也是参数的类型
         *
         * 执行方法体也为apply
         *
         */
        BinaryOperator<Integer> binaryOperator = (item,items)->item+items;
        System.out.println(binaryOperator.apply(2, 3));

        System.out.println(binaryOperate(2,3,(op1,op2)->op1+op2));

        System.out.println(binaryOperate(2,3,(op1,op2)->op1-op2));

        System.out.println(binaryOperate(2,3,(op1,op2)->op1*op2));

        System.out.println(binaryOperate(2,3,(op1,op2)->op1/op2));


        /**
         *  BinaryOperate minBy 方法接收一个Comparator参数，返回一个较小的结果
         *  Comparator 比较器，根据指定的规则进行比较
         *  Compatator 也是一个函数式接口，接收两个参数，返回一个比较之后的int 类型
         *
         * 大于0 表示本体参数比较大
         * 等于0 表示想等
         * 小于零
         *
         */
        System.out.println("-==================");
        Student student1= new Student("huahua",12,178);
        Student student2= new Student("huahua",13,175);
        Student studentMin = binaryOperateMinBy(student1, student2, (s1, s2) -> s1.getAge() - s2.getAge());
        System.out.println(studentMin);
        Student studentMax = binaryOperateMaxBy(student1, student2, (s1, s2) -> s1.getAge() - s2.getAge());
        System.out.println(studentMax);


    }


    static Integer binaryOperate(Integer ope1 ,Integer ope2,BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(ope1,ope2);
    }


    static Student binaryOperateMinBy(Student student1 , Student student2, Comparator<Student> comparator){

        Student apply = BinaryOperator.minBy(comparator).apply(student1, student2);
        return apply;
    }

    /**
     *  BinaryOperator 的maxBy 接收一个比较函数Comparator, 返回比较大的结果
     */
    static Student binaryOperateMaxBy(Student student1 , Student student2, Comparator<Student> comparator){

        Student apply = BinaryOperator.maxBy(comparator).apply(student1, student2);
        return apply;
    }
}
