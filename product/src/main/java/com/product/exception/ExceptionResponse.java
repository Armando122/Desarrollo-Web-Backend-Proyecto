package com.product.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ExceptionResponse {

    /*Atributos de clase*/
    //Notación para dar formato a la fechas.
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh-mm-ss")
    private LocalDateTime timestamp;
    private Integer status;
    private HttpStatus error;
    private String mensaje;
    private String path;

    /*Constructor vacío*/
    public ExceptionResponse(){}

    /*Getter y setters*/
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public HttpStatus getError() {
        return error;
    }

    public void setError(HttpStatus error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
