package com.example.domes.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "panier")
public class Panier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "panier", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<LigneDeCommande> lignesDeCommande;

    private int quantiteTotale;

    public Panier() {
        lignesDeCommande = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<LigneDeCommande> getLignesDeCommande() {
        return lignesDeCommande;
    }



    public void setLignesDeCommande(List<LigneDeCommande> lignesDeCommande) {
        this.lignesDeCommande = lignesDeCommande;
    }

    public void ajouterLigneDeCommande(LigneDeCommande ligneDeCommande) {
        if (lignesDeCommande == null) {
            lignesDeCommande = new ArrayList<>();
        }
        lignesDeCommande.add(ligneDeCommande);
        ligneDeCommande.setPanier(this);
    }

    public void supprimerLigneDeCommande(LigneDeCommande ligneDeCommande) {
        lignesDeCommande.remove(ligneDeCommande);
        ligneDeCommande.setPanier(null);
    }
    public int getQuantiteTotal() {
        int quantiteTotale = 0;
        for (LigneDeCommande ligne : lignesDeCommande) {
            quantiteTotale += ligne.getQuantite();
        }
        return quantiteTotale;
    }
}
