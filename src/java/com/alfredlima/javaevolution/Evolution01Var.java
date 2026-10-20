package com.alfredlima.javaevolution;

import com.alfredlima.javaevolution.model.Student;
import com.alfredlima.javaevolution.service.StudentService;

import java.util.List;

public class Evolution01Var {

    public static void main(String[] args) {

        //Java 8
        List<Student> studentList = StudentService.getStudentList();

        for (Student student : studentList) {
            System.out.println(student);
        }


        //Java 10+
        var students = StudentService.getStudentList();

        for (Student student : students) {
            System.out.println(student);
        }


    }
}
