package com.wf.lambda;

/**
 * @Author: wangfa
 * @Date: 2020/6/13 15:49
 * @Description:
 */

@FunctionalInterface
public interface A02_InterfaceFunctionC {

    void myInterface();

    // 定义覆盖Object的方法不会被记入抽象方法的数量中
    @Override
    public abstract  String toString();
}
