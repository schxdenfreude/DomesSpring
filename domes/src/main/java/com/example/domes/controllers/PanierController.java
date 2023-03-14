package com.example.domes.controllers;

import com.example.domes.beans.LigneDeCommande;
import com.example.domes.beans.Panier;
import com.example.domes.beans.Products;
import com.example.domes.repository.LigneDeCommandeRepository;
import com.example.domes.repository.PanierRepository;
import com.example.domes.repository.ProductRepository;
import com.example.domes.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
public class PanierController {

    @Autowired
    private PanierRepository panierRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PanierService panierService;

    @Autowired
    private LigneDeCommandeRepository ligneDeCommandeRepository;

    Panier panier = new Panier();


    // Appel de la méthode ajouterLigneDeCommande pour ajouter un produit au panier
    @PostMapping("/ajouter-produit/{idProduct}")
    public String ajouterProduitDansPanier(@PathVariable int idProduct, @RequestParam("quantite") int quantite, HttpSession session) {

        Panier panier = (Panier) session.getAttribute("panier");
        if (panier == null) {
            panier = new Panier();
            session.setAttribute("panier", panier);
        }
        Products produit = productRepository.findById(idProduct).orElseThrow(() -> new RuntimeException("Produit introuvable"));
        panierRepository.save(panier);
        LigneDeCommande ligneDeCommande = panierService.ajouterLigneDeCommande(panier, produit,quantite,produit.getProductName(), produit.getPrice(), produit.getImagePath(), produit.getGender(),produit.getVaccinated(), produit.getChipped());
        Optional<Products> optionalProduct = productRepository.findById(idProduct);
        return "redirect:/panier";
    }
    @GetMapping("/supprimerLigneDeCommande/{idLigneDeCommande}/{id}")
    public String supprimerLigneDeCommande(@PathVariable Long idLigneDeCommande, @PathVariable Long id, Model model, HttpSession session) {
        panierService.supprimerLigneDeCommande(idLigneDeCommande, id, session);
        Panier panier = panierService.getPanier(id);
        List<LigneDeCommande> lignesDeCommande = panier.getLignesDeCommande();
        model.addAttribute("lignesDeCommande", lignesDeCommande);
        return "redirect:/panier";
    }


}