package com.invoice.configuration.client;

import com.invoice.api.dto.DtoProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductClient {
  @GetMapping("product/{gtin}")
	public ResponseEntity<DtoProduct> getProduct(@PathVariable String gtin);
}
