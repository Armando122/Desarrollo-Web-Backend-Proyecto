package com.product.exception;

import org.springframework.http.HttpStatus;

/**
 * Clase intermedia que mantiene comunicación con la clase
 * ExceptionResponse.
 * */
public class ApiException extends RuntimeException {

    private HttpStatus status;

    /*Constructor de clase*/
    public ApiException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    /*Getters y Setters*/
    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
