package com.wf.methodreference;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 21:52
 * @Description: 对象比较方法器
 */
public class A03_DogComparator {

    public    int compareWithWeight(Dog dog1,Dog dog2){
        return dog1.getWeight()-dog2.getWeight();
    }


    public   int compareWithName(Dog dog1,Dog dog2){
        return dog1.getName().compareTo(dog2.getName());
    }

}
