package com.wf.lambda;

/**
 * @Author: wangfa
 * @Date: 2020/6/13 16:20
 * @Description:
 */
public class A04_FunctionInterfaceDemo {


    public void fn(A04_MyInterface myInterface) {
        System.out.println("A03 fn method start");
        myInterface.myInterfaceMethod();
        System.out.println("A03 fn method end");

    }

    public static void main(String[] args) {


        A04_FunctionInterfaceDemo a04_FunctionInterfaceDemo = new A04_FunctionInterfaceDemo();

        //
        a04_FunctionInterfaceDemo.fn(new A04_MyInterface() {
            @Override
            public void myInterfaceMethod() {
                System.out.println("myInterfaceMethod ..");
            }
        });

        // 如果我们的抽象方法是没有参数列表的时候，函数括号是不能被省略的
        a04_FunctionInterfaceDemo.fn(()->{
            System.out.println("myInterfaceMethod with lambda ..");
        });


        // 利用lambda表达式实现接口(匿名类)
        A04_MyInterface myInterface = ()->{
            System.out.println(" myInterfaceMethod with Define");
        };
        a04_FunctionInterfaceDemo.fn(myInterface);
    }
}


