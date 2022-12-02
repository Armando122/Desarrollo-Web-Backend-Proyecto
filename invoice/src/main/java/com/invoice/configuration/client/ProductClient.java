package com.invoice.configuration.client;

import com.invoice.api.dto.DtoProduct;
import com.product.api.dto.ApiResponse;
import com.product.api.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(name = "product-service")
public interface ProductClient {
  @GetMapping("product/{gtin}")
	public ResponseEntity<DtoProduct> getProduct(@PathVariable String gtin);

    @PutMapping("product/{gtin}/stock/{stock}")
    public ResponseEntity<DtoProduct> updateProductStock(@PathVariable("gtin") String gtin, @PathVariable("stock") Integer stock);

}
