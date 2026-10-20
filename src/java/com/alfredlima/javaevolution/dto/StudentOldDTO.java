package com.alfredlima.javaevolution.dto;

import java.time.LocalDate;

/**
 * JAVA 8 - DTO
 */
public class StudentOldDTO {

    private String documentId;
    private String name;
    private LocalDate birthDate;

    public StudentOldDTO(String documentId, String name, LocalDate birthDate) {
        this.documentId = documentId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
