package com.wf.defaultmethod;

/**
 * @Author: wangfa
 * @Date: 2020/7/11 19:19
 * @Description:
 */
public class MyInterfaceImpl implements MyInterface01,MyInterface02 {

    /**
     * 当我们的多实现接口时，并且存在相同名称的默认方法时，
     * 我们的实现类会不知道如何进行选择默认方法的，此时我们只能进行重写
     * 如果我们想要使用某一个接口中的默认方法，可以在重写的方法中进行 接口名.super.方法名
     *
     */
    @Override
    public void myDefaultMethod() {
        MyInterface02.super.myDefaultMethod();
    }
}
