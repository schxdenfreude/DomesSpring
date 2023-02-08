package com.example.domes.service;

import com.example.domes.beans.Products;
import com.example.domes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ServiceProductImpl implements ServiceProduct{
    private ProductRepository productRepository;

    @Autowired
    public ServiceProductImpl(ProductRepository productRepository){

        this.productRepository = productRepository;
    }

//Fonction qui choisit 5 animaux à montrer sur l'accueil
    public List<Products> homeCarousel(){
        // marche pas
        int max = productRepository.countProducts();
        List<Products> listProducts = new ArrayList<Products>();
        Random rand = new Random();
        // Penser à changer une fois qu'on aura plus de produits
        int firstId = rand.nextInt(1);
        int lastId;
        //Marchera quand on aura plus de 5 produits
        if (firstId < 5){
             lastId = firstId + 5;
        }else{
            lastId = firstId;
            firstId = lastId - 5;
        }
        List<Products> listeProduits = productRepository.getProducts(firstId, lastId);
        return listeProduits;
    }


    public Optional<Products> showProduct(int i){
        Optional<Products> product;
        product = productRepository.findById(i);
        return product;
    }
}
