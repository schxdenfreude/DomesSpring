package com.example.domes.service;

import com.example.domes.beans.Products;
import com.example.domes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceInventoryImpl implements ServiceInventory{
    private ProductRepository productRepository;

    @Autowired
    public ServiceInventoryImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Products> getProducts(){
        List<Products> productsList = new ArrayList<Products>();
        productsList = productRepository.getAllProducts();
        System.out.println(productsList);
        return productsList;
    }

}
