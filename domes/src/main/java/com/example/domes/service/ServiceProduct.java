package com.example.domes.service;

import com.example.domes.beans.Products;

import java.util.List;
import java.util.Optional;

public interface ServiceProduct {
    public List<Products> homeCarousel();

    public Optional<Products> showProduct(int i);
}
