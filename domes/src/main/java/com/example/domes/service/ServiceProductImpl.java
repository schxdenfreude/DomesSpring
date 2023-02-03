package com.example.domes.service;

import com.example.domes.beans.Products;
import com.example.domes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ServiceProductImpl implements ServiceProduct{
    private ProductRepository productRepository;

    @Autowired
    public ServiceProductImpl(ProductRepository productRepository){

        this.productRepository = productRepository;
    }


    public List<Products> homeCarousel(){
        int max = productRepository.countProducts();
        System.out.println(max);
        List<Products> listProducts = new ArrayList<Products>();
        Random rand = new Random();
        int firstId = rand.nextInt(1);
        System.out.println("firstif = " + firstId);
        int lastId;
        if (firstId < 5){
             lastId = firstId + 5;
        }else{
            lastId = firstId;
            firstId = lastId - 5;
        }
        List<Products> listeProduits = productRepository.getProducts(firstId, lastId);
        System.out.println(listeProduits);
        return listeProduits;
    }
}
