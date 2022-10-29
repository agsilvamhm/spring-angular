package com.agsilva.springangular.exceptions;

public class DataIntegrityVioletionException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DataIntegrityVioletionException(String message, Throwable cause  ) {
        super(message, cause);
    }

    public DataIntegrityVioletionException(String message) {
        super(message);
    }


}
