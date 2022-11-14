package com.product.api.dto;

public class ApiResponse {

    /*Mensaje*/
    private String message;

    /**
     * Constructor de Api response
     * @param message el mensaje que se devolverá.
     **/
    public ApiResponse(String message) {
        super();
        this.message = message;
    }

    /**
     * Método para obtener el mensaje
     * @return message
     **/
    public String getMessage() {
        return message;
    }

    /**
     * Método para modificar el mensaje.
     * */
    public void setMessage(String message) {
        this.message = message;
    }
}
