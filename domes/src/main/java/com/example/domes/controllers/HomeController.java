package com.example.domes.controllers;

import com.example.domes.beans.Client;
import com.example.domes.beans.Products;
import com.example.domes.beans.User;
import com.example.domes.service.ServiceInventory;
import com.example.domes.service.ServiceInventoryImpl;
import com.example.domes.service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private ServiceProduct serviceProduct;

    @Autowired
    private ServiceInventory serviceInventory;


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
        // Penser  à gérer le post du bouton
        Optional<Products> products =  serviceProduct.showProduct(1);
        products.ifPresentOrElse(
                product -> model.addAttribute("product",product),
                () -> model.addAttribute("message","le produit n'existe plus")
        );
        return "product";
    }

    @GetMapping("/inventory")
    public String goInventory(Model model) {
        List<Products> listProducts = serviceInventory.getProducts();
        System.out.println("page inventaire");
        model.addAttribute("ListeProduits",listProducts);
        return "inventory";
    }

    @ModelAttribute("client")
    public Client getDefaultClient(){
        return new Client();
    }
}
