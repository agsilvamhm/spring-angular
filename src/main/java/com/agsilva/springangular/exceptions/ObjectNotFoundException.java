package com.agsilva.springangular.exceptions;

public class ObjectNotFoundException extends RuntimeException{
    private static final Long serialVersionUID = 1l;

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectNotFoundException(String menssage) {
        super(menssage);
    }
}
