package com.wf.optional;

import java.util.Optional;

/**
 * @Author: wangfa
 * @Date: 2020/6/27 15:34
 * @Description:
 */
public class A01_Optional {


    public static void main(String[] args) {

        Teacher teacher = new Teacher("teacher");
        if(null !=teacher){
            //逻辑处理
            Student student = teacher.getStudent();
            if(null!=student){
                // 逻辑处理
                System.out.println(student.getName());
            }
        }
        /**
         *  由于我们的数据来源于数据库或者网络，在进行使用的时候一般需要进行非null校验
         *  于是我们就诞生了Optional在基于lambda表达式的基础上进行简化操作
         *  Optional是一个容器，我们可以基于提供的一些方法进行简便操作
         */
        Optional<Teacher> optional = Optional.of(teacher);
        // 判断容器中的对象是否为空方法
        if (optional.isPresent()) {
            // get 获取容器中的值
            Teacher teacher1 = optional.get();
            System.out.println(teacher1.getName());
        }
        /**
         * 上面的判断，没有使用jdk8 的流处理，和我们自己进行null判断没有什么两样，是不被推荐使用的
         */



        // of 方法传递进行的一定不为null,否则会报错,与ofNullable
//        teacher = null;
        Optional<Teacher> optional1 = Optional.of(teacher);
        // Optional ofNullable 如果为null的话，返回empty,否则的话返回值
        teacher = null;
        Optional<Teacher> optional2 = Optional.ofNullable(teacher);


        //ifPresent 接收Consumer的lambda表达式，如果为null，则不进行处理。否则的话，进行Consumer处理
        optional2.ifPresent(item->{ item.getName(); });
        // orElse 如果值不为null，则返回值，如果为null 则返回参数值
        optional.orElse(new Teacher("lisi"));
        // orElseGet 如果值不为null ，则返回值，如果为null ，则从Supplier函数中获取一个值
        optional.orElseGet(()->new Teacher("zhangsan"));

















        /**
         * Optional 是针对NEP 而出现的一种处理空指针问题的类，
         * Optional 与String类似是一个final修饰的类，不可修改
         * Optional 是一个容器对象，可以包含非null 或者null对象的容器
         *
         * Optional 是一个基于值对象的类(value-base class)
         * https://docs.oracle.com/javase/8/docs/api/java/lang/doc-files/ValueBased.html
         *
         * Optional 的实例创建是通过方法工厂进行的。
         *
         * 不要使用Optional作为方法参数或者成员变量，它的存在仅仅是为了规避返回值为null的对象，通常作为返回值使用。
         *
         * */





        /**
         * Value-based Classes
         * Some classes, such as java.util.Optional and java.time.LocalDateTime, are value-based. Instances of a value-based class:
         * 1、are final and immutable (though may contain references to mutable objects);
         * 2、have implementations of equals, hashCode, and toString which are computed solely from the instance's state and not from its identity or the state of any other object or variable;
         * 3、make no use of identity-sensitive operations such as reference equality (==) between instances, identity hash code of instances, or synchronization on an instances's intrinsic lock;
         * 4、are considered equal solely based on equals(), not based on reference equality (==);
         * 5、do not have accessible constructors, but are instead instantiated through factory methods which make no committment as to the identity of returned instances;
         * 6、are freely substitutable when equal, meaning that interchanging any two instances x and y that are equal according to equals() in any computation or method invocation should produce no visible change in behavior.
         *
         *
         * A program may produce unpredictable results if it attempts to distinguish two references to equal values of a value-based class, whether directly via reference equality or indirectly via an appeal to synchronization, identity hashing, serialization,
         * or any other identity-sensitive mechanism. Use of such identity-sensitive operations on instances of value-based classes may have unpredictable effects and should be avoided.
         *
         *
         *
         */
    }
}
