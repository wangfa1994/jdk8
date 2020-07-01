package com.wf.lambda;

/**
 * @Author: wangfa
 * @Date: 2020/6/13 14:41
 * @Description:
 */
public class Main {

    /**
     *
     * 函数式接口只要存在于java.util.function包中
     *
     * 主要包括四大类 Consumer，Function，Predicate，Supplier以及基于这四类给我们提供的一些便捷操作函数。
     * Bi系列，Double系列，Int系列，Long系列，Object系列，ToDouble，ToInt，ToLong系列等
     *
     * Consumer  接收一个参数，不返回结果 accept
     *
     * Function 接收一个参数，返回一个结果  apply
     *
     * Predicate 接收一个参数，返回一个布尔结果 test
     *
     * Supplier 不接收参数，返回一个结果  get
     *
     * Bi系列 接收对应的两个参数。返回对应的系列结果(BiConsumer,不返回结果，BiFunction,返回一个结果)
     *
     * Double系列等都是入参为对应的类型。
     *
     * To系列都是返回对应的类型
     *
     *
     * 函数接口的三种实例方法:lambda表达式，方法引用，构造方法引用
     */
}
