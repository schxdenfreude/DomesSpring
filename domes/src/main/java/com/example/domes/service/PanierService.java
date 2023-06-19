package com.example.domes.service;

import com.example.domes.beans.LigneDeCommande;
import com.example.domes.beans.Panier;
import com.example.domes.beans.Products;
import com.example.domes.repository.CategoryRepository;
import com.example.domes.repository.LigneDeCommandeRepository;
import com.example.domes.repository.PanierRepository;
import com.example.domes.repository.ProductRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class PanierService {
    private final LigneDeCommandeRepository ligneDeCommandeRepository;
    private final ProductRepository productRepository;
    private final PanierRepository panierRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    public PanierService(LigneDeCommandeRepository ligneDeCommandeRepository, ProductRepository productRepository, PanierRepository panierRepository, CategoryRepository categoryRepository) {
        this.ligneDeCommandeRepository = ligneDeCommandeRepository;
        this.productRepository = productRepository;
        this.panierRepository = panierRepository;
        this.categoryRepository = categoryRepository;
    }

    public Panier getPanier(Long id) {
        Optional<Panier> optionalPanier = panierRepository.findById(id);
        if (optionalPanier.isPresent()) {
            Panier panier = optionalPanier.get();
            Hibernate.initialize(panier.getLignesDeCommande());
            return panier;
        } else {
            throw new RuntimeException("Panier non trouvé");
        }
    }
    public LigneDeCommande ajouterLigneDeCommande(Panier panier, Products product, int quantite, String productName, Double price, String imagePath, Boolean gender, Boolean vaccinated, Boolean chipped) {
        LigneDeCommande ligneDeCommande = new LigneDeCommande();
        ligneDeCommande.setQuantite(quantite);
        ligneDeCommande.setPanier(panier);
        ligneDeCommande.setProduit(product);
        ligneDeCommande.setProductName(productName);
        ligneDeCommande.setPrice(price);
        ligneDeCommande.setImagePath(imagePath);
        ligneDeCommande.setGender(gender);
        ligneDeCommande.setVaccinated(vaccinated);
        ligneDeCommande.setChipped(chipped);
        ligneDeCommande.getTotal();

        ligneDeCommandeRepository.save(ligneDeCommande);
        panier.getLignesDeCommande().add(ligneDeCommande);
        System.out.println("Panier" + panier.toString());
        System.out.println("Ligne de commande" + product.toString());
        return ligneDeCommande;
    }

    @Transactional
    public void supprimerLigneDeCommande(Long idLigneDeCommande, Long id, HttpSession session) {
        Optional<LigneDeCommande> optionalLigne = ligneDeCommandeRepository.findById(idLigneDeCommande);
        Optional<Panier> optionalPanier = panierRepository.findById(id);

        if (optionalLigne.isPresent() && optionalPanier.isPresent()) {
            LigneDeCommande ligne = optionalLigne.get();
            Panier panier = optionalPanier.get();
            boolean removed = panier.getLignesDeCommande().remove(ligne);
            if (removed) {
                panierRepository.save(panier);
                ligneDeCommandeRepository.delete(ligne);
                session.setAttribute("panier", panier);
            } else {
                System.out.println("La ligne de commande n'a pas été trouvée dans le panier.");
            }
        } else {
            System.out.println("Ligne de commande ou panier introuvable.");
        }
    }
//    public double calculerPrixTotal(Long idPanier) {
//        List<LigneDeCommande> lignesDeCommande = ligneDeCommandeRepository.findByPanierId(idPanier);
//        double prixTotal = 0.0;
//        for (LigneDeCommande ligneDeCommande : lignesDeCommande) {
//            prixTotal += ligneDeCommande.getPrice() * ligneDeCommande.getQuantite();
//        }
//        return prixTotal;
//    }


}

