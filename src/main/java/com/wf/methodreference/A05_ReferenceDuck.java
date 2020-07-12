package com.wf.methodreference;

import com.wf.lambda.A02_InterfaceFunctionC;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author: wangfa
 * @Date: 2020/7/11 18:26
 * @Description: 方法引用四：   构造方法引用 类名::new
 */
public class A05_ReferenceDuck {


    public static void main(String[] args) {

        // String 的创建 String str = new String(); 不接收参数直接返回一个空串
        System.out.println(getString(String::new));


        //String 的创建 String str = new String(""); 接收一个参数，返回一个参数
        System.out.println(getStringWithParam("hello",String::new));

        /**
         * 构造方法引用，创建对应的对象
         *
         */
        System.out.println(getDuckWithParam("duckName",Duck::new));

    }

    public  static  String getString(Supplier supplier){
        return  supplier.get()+"huahua";
    }

    public static  String getStringWithParam(String s, Function<String,String> function){
        return function.apply(s);
    }

    public static  Duck getDuckWithParam(String s, Function<String,Duck> function){
        return function.apply(s);
    }
}
