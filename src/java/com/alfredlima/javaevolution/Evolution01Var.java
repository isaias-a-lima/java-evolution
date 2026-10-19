package com.alfredlima.javaevolution;

import com.alfredlima.javaevolution.model.Student;
import com.alfredlima.javaevolution.service.StudentService;

public class Evolution01Var {

    public static void main(String[] args) {

        //Java 8
        //List<Student> students = StudentService.getStudentList();

        //Java 10+
        var students = StudentService.getStudentList();

        for (Student student : students) {
            System.out.println(student);
        }


    }
}
