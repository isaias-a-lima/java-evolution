package com.alfredlima.javaevolution.service;

import com.alfredlima.javaevolution.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentService {

    public static List<Student> getStudentList(String ... names) {
        List<Student> students = new ArrayList<>();

        for (String name : names) {

            int age = (int) (Math.random() * 83) + 7;
            int month = (int) (Math.random() * 11) + 1;
            int day = (int) (Math.random() * 28) + 1;

            students.add(new Student(String.valueOf(Objects.hash(name)), name, LocalDate.of(LocalDate.now().getYear(), month, day).minusYears(age)));
        }

        return students;
    }

    public static List<Student> getStudentList() {
        return getStudentList("John Mayer", "Mariah Smith", "James Bond");
    }
}
