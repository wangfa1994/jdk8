package com.wf.lambda;

import java.util.function.Supplier;

/**
 * @Author: wangfa
 * @Date: 2020/6/26 15:39
 * @Description:
 */
public class A11_SupplierClass {

    /**
     *  单例 工厂的使用
     */

    public static void main(String[] args) {

        /**
         * Supplier接口，不接收任何参数，返回一个结果
         * Supplier接口，get运行方法体
         *
         */
        Supplier<Student> supplier = ()->new Student("name",14,28);
        System.out.println(supplier.get());

        // 函数接口实例化三种方式 labmda表达式，方法引用，构造引用
        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get());

    }

}
