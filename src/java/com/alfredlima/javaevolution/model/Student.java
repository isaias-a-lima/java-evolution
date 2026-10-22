package com.alfredlima.javaevolution.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private String documentId;
    private String name;
    private LocalDate birthDate;

    public Student(String documentId, String name, LocalDate birthDate) {
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

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(documentId, student.documentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
