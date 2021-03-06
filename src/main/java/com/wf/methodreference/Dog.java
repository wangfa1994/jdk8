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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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


}
