package com.wf.lambda;

import java.util.Comparator;

/**
 * @Author: wangfa
 * @Date: 2020/6/25 15:27
 * @Description:
 */
public class Student{

    private String name;

    private Integer age;

    private Integer height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Student() {
    }

    public Student(String name, Integer age, Integer height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
