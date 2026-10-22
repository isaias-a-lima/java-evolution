package com.alfredlima.javaevolution;

import com.alfredlima.javaevolution.model.Student;
import com.alfredlima.javaevolution.service.StudentService;

import java.time.LocalDate;

/**
 * Pattern Matching for instanceof
 * Java 16
 */
public class Evolution05PatternMatching {

    public static void main(String[] args) {

        for (String arg : args) {
            Object object = arg;

            //Java 8
            if (object instanceof String) {
                String value = (String) object;
                System.out.println("Java 8 \n" + value);
            }

            //Java 16
            if (object instanceof String value2) {
                System.out.println("Java 16 \n" + value2);
            }
        }

        //Java 16

        var student = StudentService.getStudentList("Charles Brown").getFirst();

        if (student instanceof Student newStudent) {
            System.out.println("birthdate 1 " + student.getBirthDate());

            newStudent.setBirthDate(LocalDate.of(1982, 12, 7));

            System.out.println("birthdate 2 " + newStudent.getBirthDate());

            System.out.println("birthdate 1 " + student.getBirthDate());
        }

    }
}
