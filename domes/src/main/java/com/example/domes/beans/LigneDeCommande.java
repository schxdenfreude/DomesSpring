package com.example.domes.beans;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LigneDeCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLigneDeCommande;

    @ManyToOne
    private Products produit;

    private int quantite;

    private String productName;

    private Double price;

    private String imagePath;
    private Double total;

    @Column(name = "chipped", columnDefinition = "BOOLEAN")
    private Boolean chipped;
    @Column(name = "gender", columnDefinition = "BOOLEAN")
    private Boolean gender;
    @Column(name = "vaccinated", columnDefinition = "BOOLEAN")
    private Boolean vaccinated;
    @ManyToOne
    private Panier panier;

    public LigneDeCommande() {}

    public void getTotal() {
        if (quantite != 0) {
            total = quantite * produit.getPrice();
        }
    }

    public LigneDeCommande(Products produit, LigneDeCommande ligneDeCommande, int quantite, Double price, String imagePath, Boolean gender, Boolean vaccinated) {
        this.produit = produit;
        this.quantite = quantite;
        this.productName = produit.getProductName();
        this.price = produit.getPrice();
        this.imagePath = produit.getImagePath();
        this.gender = gender;
        this.vaccinated = vaccinated;
    }
    //méthode pour calculer le total


    // getters et setters



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getIdLigneDeCommande() {
        return idLigneDeCommande;
    }

    public void setIdLigneDeCommande(Long idLigneDeCommande) {
        this.idLigneDeCommande = idLigneDeCommande;
    }

    public Products getProduit() {
        return produit;
    }

    public void setProduit(Products produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public Boolean getChipped() {
        return chipped;
    }

    public void setChipped(Boolean chipped) {
        this.chipped = chipped;
    }
}
