package com.example.domes.controllers;

import com.example.domes.beans.Client;
import com.example.domes.beans.Products;
import com.example.domes.beans.User;
import com.example.domes.service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private ServiceProduct serviceProduct;

    @GetMapping("/home")
    public String goHome(Model model){
        System.out.println("page home");
        //choisir les animaux en facade
        List<Products> listeProduits = serviceProduct.homeCarousel();
        model.addAttribute("ListeCarousel",listeProduits);
        return "index";
    }
    @GetMapping("/panier")
    public String goPanier(){
        System.out.println("page panier");
        return "panier";
    }

    @GetMapping("/login")
    public String goLogin(){
        System.out.println("page login");
        return "login";
    }

    @GetMapping("/product")
    public String goProduct(Model model){
        System.out.println("page product");
        // Penser  à gérer le post du bouton
        Optional<Products> products =  serviceProduct.showProduct(3);
        System.out.println(products);
        products.ifPresentOrElse(
                product -> model.addAttribute("product",product),
                () -> model.addAttribute("message","le produit n'existe plus")
        );
        return "product";
    }

    @ModelAttribute("client")
    public Client getDefaultClient(){
        return new Client();
    }
}
