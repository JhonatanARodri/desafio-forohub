package com.aluracursos.forohub.infra.exception;

public class ValidacionException extends RuntimeException{
    public ValidacionException(String mensaje){
        super(mensaje);
    }
}
