package com.example.domes.repository;

import com.example.domes.beans.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer> {

    @Query("SELECT COUNT(Products) FROM Products")
    public int countProducts();

    @Query("SELECT p FROM Products p WHERE p.id > :firstId AND p.id < :lastId")
    public List<Products> getProducts(@Param("firstId") int firstId, @Param("lastId") int lastId);
}
