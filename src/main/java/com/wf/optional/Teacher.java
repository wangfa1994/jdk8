package com.wf.optional;

/**
 * @Author: wangfa
 * @Date: 2020/6/27 15:53
 * @Description:
 */
public class Teacher {

    private String name;

    private Student student;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
