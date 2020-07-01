package com.wf.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @Author: wangfa
 * @Date: 2020/6/27 16:31
 * @Description:
 */
public class A02_OptionalD {


    public static void main(String[] args) {

        School school = new School();
        school.setName("school");

        Teacher teacher1= new Teacher("t1");
        Teacher teacher2= new Teacher("t2");
        school.setTeacherList(Arrays.asList(teacher1,teacher2));

        Optional<School> optional = Optional.ofNullable(school);


        // maop 映射，将一个结果映射为另外一个结果，
        List list = optional.map(item -> item.getTeacherList()).orElse(Collections.EMPTY_LIST);
        System.out.println(list);

        // map返回Optional，再进行orElse判断
        school.setTeacherList(null);
        List listNull = optional.map(item -> item.getTeacherList()).orElse(Collections.emptyList());
        System.out.println(listNull);
    }


    public  void fn(Optional optional){

    }
}
