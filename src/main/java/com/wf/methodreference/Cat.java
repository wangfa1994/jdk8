package com.wf.methodreference;

/**
 * @Author: wangfa
 * @Date: 2020/7/11 16:16
 * @Description:
 */
public class Cat {
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

    public Cat(String name, Integer weight, Integer age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    /**
     *  静态方法比较器
     */
    public  static  int compareWithWeight(Cat cat1,Cat cat2){
        return cat1.weight-cat2.weight;
    }

    /**
     *  静态方法比较器
     */
    public static  int compareWithName(Cat cat1,Cat cat2){
        return cat1.name.compareTo(cat2.name);
    }
}
