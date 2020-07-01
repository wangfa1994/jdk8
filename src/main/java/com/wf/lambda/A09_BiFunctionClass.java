package com.wf.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @Author: wangfa
 * @Date: 2020/6/25 15:26
 * @Description:
 */
public class A09_BiFunctionClass {


    public static void main(String[] args) {
        Student student0 = new Student("zhangsan",16,178);
        Student student1 = new Student("lisi",25,175);
        Student student2 = new Student("wangwu",20,180);
        Student student3 = new Student("zhaoliu",24,179);
        List<Student> studentList = Arrays.asList(student0,student1,student2,student3);

        // 选择年龄大约18的
        List<Student> withStream = selectStudentByAgeWithStream(18, studentList);
        System.out.println(withStream);
        List<Student> withBiFunction = selectStudentByAgeWithBiFunction(18, studentList);
        System.out.println(withBiFunction);

        //选择年龄大于18的
        List<Student> studentList1 = selectStudentWithBiFunction(18,studentList,(age ,studentListParam)->{
            return studentListParam.stream().filter(item->item.getAge()>age).collect(Collectors.toList());
        });
        System.out.println(studentList1);

        // 选择身高大于178的
        List<Student> studentList2 = selectStudentWithBiFunction(178, studentList, (height, studentListParam) -> {
            return studentListParam.stream().filter(item -> item.getHeight() > height).collect(Collectors.toList());
        });
        System.out.println(studentList2);


    }

    /**
     *  利用Stream 进行处理
     */
    static  List<Student> selectStudentByAgeWithStream(Integer age,List<Student> list){

        /**
         * filter 接收一个Predicate函数式接口，根据条件判断对应的item 是否继续存在流中。
         * 获取对应的符合条件的值
         * Predicate接口接收一个参数，返回true或者false，
         */
        return list.stream().filter(item ->item.getAge()>age).collect(Collectors.toList());
    }



    /**
     * 利用BiFunction,传入两个参数，返回一个结果,对List进行过滤处理
     */
    static List<Student> selectStudentByAgeWithBiFunction(Integer age,List<Student> list){
        BiFunction<Integer,List<Student>,List<Student>> function = (item,studentListParam)->{
            return studentListParam.stream().filter(stu->stu.getAge()>item).collect(Collectors.toList());
        };
        return function.apply(age, list);

    }

    /**
     *  利用BiFunction 进行行为传递，这个也是lambda的精髓
     *  上述的两个方法，都将我们的执行体进行了固化，而这个我们进行行为传递，由我们的用户自己决定
     *  根据属性进行处理 使得处理更加灵活
     */

    static List<Student> selectStudentWithBiFunction(Integer property,List<Student> listParam,BiFunction<Integer,List<Student>,List<Student>> biFunction){
       return biFunction.apply(property,listParam);
    }
}
