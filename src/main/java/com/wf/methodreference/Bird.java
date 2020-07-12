package com.wf.methodreference;

/**
 * @Author: wangfa
 * @Date: 2020/7/11 16:27
 * @Description:
 */
public class Bird {

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

    public Bird(String name, Integer weight, Integer age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    public int compareWithName(Bird bird){
        return  this.name.compareTo(bird.name);
    }

    public  int compareWithWeight(Bird bird){
        return this.age - bird.age;
    }
}
