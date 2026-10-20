package com.alfredlima.javaevolution;

import com.alfredlima.javaevolution.dto.StudentNewDTO;
import com.alfredlima.javaevolution.dto.StudentOldDTO;

import java.time.LocalDate;

public class Evolution04Records {

    public static void main(String[] args) {

        //Java 8
        StudentOldDTO studentOldDTO = new StudentOldDTO("1001", "John Mayer", LocalDate.of(1980, 12, 15));
        System.out.println("Java 8 - DTO\n" + studentOldDTO.toString());

        //Java 14+
        var studentNewDTO = new StudentNewDTO("1002", "Mary Key", LocalDate.of(1975, 4, 7));
        System.out.println("Java 14+ - DTO\n" + studentNewDTO.toString());

    }
}
