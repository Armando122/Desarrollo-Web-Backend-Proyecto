package com.product.api.service;

import com.product.api.dto.ApiResponse;
import com.product.api.entity.Category;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface SvcCategory {

    //Consulta de todas las categorías
    List<Category> getCategories();

    //Consulta de una sola categoría
    Category getCategory(Integer category_id);

    //Creación de categoría
    ApiResponse createCategory(Category category);

    //Actualización de categoría
    ApiResponse updateCategory(Integer category_id, Category category);

    //Eliminar categoría
    ApiResponse deleteCategory(Integer category_id);
}
