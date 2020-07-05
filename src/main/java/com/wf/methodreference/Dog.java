package com.wf.methodreference;

import java.util.Comparator;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 19:07
 * @Description:
 */
public class Dog  implements Comparable<Dog> {

    private String  name;

    private Integer weight;

    private  Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    public Dog(String name, Integer weight, Integer age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return o.age-this.age;
    }


    /**
     *  静态方法比较器
     */
    public  static  int compareWithWeight(Dog dog1,Dog dog2){
        return dog1.weight-dog2.weight;
    }

    /**
     *  静态方法比较器
     */
    public static  int compareWithName(Dog dog1,Dog dog2){
        return dog1.name.compareTo(dog2.name);
    }


}
