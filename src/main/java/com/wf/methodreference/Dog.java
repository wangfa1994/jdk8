package com.wf.methodreference;

/**
 * @Author: wangfa
 * @Date: 2020/7/5 19:07
 * @Description:
 */
public class Dog {

    private String  name;

    private Integer weight;


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



    public  static  int compareWithWeight(Dog dog1,Dog dog2){
        return dog1.weight-dog2.weight;
    }


    public static  int compareWithName(Dog dog1,Dog dog2){
        return dog1.name.compareTo(dog2.name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Dog(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }
}
