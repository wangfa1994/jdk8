package com.wf.stream;

/**
 * @Author: wangfa
 * @Date: 2020/7/12 10:29
 * @Description:
 */
public class Phone {

    private String name;

    private  int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Phone() {
    }

    public Phone(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
