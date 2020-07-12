package com.wf.methodreference;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 21:52
 * @Description: 对象比较方法器
 */
public class A03_PigComparator {

    public    int compareWithWeight(Pig pig1,Pig pig2){
        return pig1.getWeight()-pig2.getWeight();
    }


    public   int compareWithName(Pig pig1,Pig pig2){
        return pig1.getName().compareTo(pig2.getName());
    }

}
