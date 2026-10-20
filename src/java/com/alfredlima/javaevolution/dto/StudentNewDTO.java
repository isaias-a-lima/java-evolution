package com.alfredlima.javaevolution.dto;

import java.time.LocalDate;

public record StudentNewDTO(
        String documentId,
        String name,
        LocalDate birthDate
) {
}
