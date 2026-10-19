package com.alfredlima.javaevolution;

import com.alfredlima.javaevolution.model.Status;

import java.util.logging.Logger;

public class Evolution02Switch {

    public static void main(String[] args) {

        final Logger LOG = Logger.getLogger(Evolution02Switch.class.getName());

        String description;

        //java 8
        switch (Status.ACTIVE) {
            case ACTIVE:
                description = "Ativo";
                break;
            case INACTIVE:
                description = "Inativo";
                break;
            default:
                description = "Desconhecido";
        }

        System.out.println("Description: " + description);

        //java 17
        String description2 = switch (Status.INACTIVE) {
            case ACTIVE -> { // Usa-se desta forma para executar qualquer coisa antes de retornar o valor
                LOG.info("Cliente ativo");
                yield "Ativo";
            }
            case INACTIVE -> "Inativo"; //Usa-se desta forma para apenas retornar o valor.
            default -> {
                LOG.warning("Status desconhecido");
                yield "Desconhecido";
            }
        };

        System.out.println("Description 2: " + description2);
    }
}
