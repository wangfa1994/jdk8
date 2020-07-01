package com.wf.optional;

import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2020/6/27 15:53
 * @Description:
 */
public class School {

    private String name;

    private List<Teacher> teacherList;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
