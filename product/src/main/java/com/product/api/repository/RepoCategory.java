package com.product.api.repository;

import com.product.api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RepoCategory extends JpaRepository<Category, Integer> {

    //Para listar las categorías por status.
    @Query(value = "SELECT * FROM category WHERE status = :status", nativeQuery = true)
    List<Category> findByStatus(@Param("status") Integer status);

    //Para listar las categorías por ID.
    @Query(value = "SELECT * FROM category WHERE category_id = :category_id AND status = 1", nativeQuery = true)
    Category findByCategoryId(@Param("category_id") Integer category_id);

    //Para listar las categorías.
    @Query(value = "SELECT * FROM category WHERE category = :category", nativeQuery = true)
    Category findByCategory(@Param("category") String category);

    //Para agregar categorías.
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO category (category,status) VALUES(:category,1)", nativeQuery = true)
    void createCategory(@Param("category") String category);

    //Para actualizar categorías.
    @Modifying
    @Transactional
    @Query(value = "UPDATE category SET category = :category WHERE category_id = :category_id", nativeQuery = true)
    Integer updateCategory(@Param("category_id") Integer category_id, @Param("category") String category);

    //Para actualizar status.
    @Modifying
    @Transactional
    @Query(value = "UPDATE category SET status = 1 WHERE category_id = :category_id", nativeQuery = true)
    Integer activateCategory(@Param("category_id") Integer category_id);

    //Para borrar categorías.
    @Modifying
    @Transactional
    @Query(value = "UPDATE category SET status = 0 WHERE category_id = :category_id", nativeQuery = true)
    void deleteById(@Param("category_id") Integer category_id);
}
