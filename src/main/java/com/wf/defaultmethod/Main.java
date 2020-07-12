package com.wf.defaultmethod;

import com.wf.lambda.A02_InterfaceFunctionC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wangfa
 * @Date: 2020/7/11 18:45
 * @Description:
 */
public class Main {
    /**
     *
     * 默认方法
     *
     */
    public static void main(String[] args) {
        /**
         * 同时实现不同的接口，但是其中的默认方法是同名的，需要重写默认方法
         */
        MyInterfaceImpl  myInterface = new MyInterfaceImpl();
        myInterface.myDefaultMethod();


        /**
         * 继承一个已经实现的类，并且实现另外一个接口，此时，继承会大于实现
         * 会利用到继承类中的默认实现方法，而不是接口中的默认方法
         *
         * 原理类似于上述，只不过这个重写的过程被已经实现的类给完成了，我们只需要继承即可
         *
         */
        MyInferfaceExtendsImpl myInferfaceExtends = new MyInferfaceExtendsImpl();
        myInferfaceExtends.myDefaultMethod();

        /**
         * 思考，jdk8 为什么会引入接口的默认方法
         *
         * 最大的一个好处就是，不破坏原有的代码，而且还可以新增功能
         *
         * 例如List中新增的sort默认方法，
         * 如果我们要扩展List接口的排序功能，最好的方式就是在顶层进行扩展，
         * 如果我们在不引入默认方法的时候，我们只在顶层进行定义，这样的话，会造成List的实现方法进行大量修改
         * 而有因为jdk不能控制1.8以前已存在的用户代码，不确定使用者是否重新实现我们的List接口，
         * 如果我们只是在顶层进行定义，那么我们的用户在升级到jdk8的时候，会牵扯到大量实现List接口的方法的修改。
         * 每一次的升级都是为了向前兼容，所以要在不影响以前代码同时，进行扩展，使用了默认方法。
         *
         *
         *
         */
    }
}
