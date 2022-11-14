package com.product.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

/**
 * Clase que intercepta excepciones de api exception.
 * Que intercepta las respuestas de ApiException.
 * Nombre de clase es: RestExceptionHandler, se usó en vez de Exception Handler
 * para evitar errores con la clase del mismo nombre.
 * */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    //Webrequest para acceder a ruta de excepción
    @ExceptionHandler(ApiException.class)
    protected ResponseEntity<ExceptionResponse> handleException(ApiException exception, WebRequest request) {
        //Se crea la excepción
        ExceptionResponse response = new ExceptionResponse();
        response.setTimestamp(LocalDateTime.now());
        response.setStatus(exception.getStatus().value());
        response.setError(exception.getStatus());
        response.setMensaje(exception.getMessage());
        response.setPath(((ServletWebRequest)request).getRequest().getRequestURI().toString());

        //Se devuelve el objeto.
        return new ResponseEntity<>(response,response.getError());
    }
}
