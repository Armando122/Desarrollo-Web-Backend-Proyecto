package com.invoice.api.dto;

/*
 * Requerimiento 3
 * Agregar atributos de clase para la validación del producto
 */
public class DtoProduct {
  private Integer stock;
  private String gtin;


  public Integer getStock(){
    return stock
  }

  public Integer setStock(Integer stock){
    this.stock=stock;
  }

  public String getGTIN(){
    return gtin;
  }

  public String setGTIN(String gtin){
    this.gtin=gtin;
  }
  
  public boolean isStockAvailable(Integer whatImrequesting){
    return stock<=whatImrequesting;
  }

  public void updateStock(Integer whatImrequesting){
    this.stock-=whatImrequesting;
  }
}
