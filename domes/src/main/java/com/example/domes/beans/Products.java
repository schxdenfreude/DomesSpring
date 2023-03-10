package com.example.domes.beans;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    private String productName;

    private String productDescription;

    @Temporal(TemporalType.DATE)
    private Date productBirth;
    @Temporal(TemporalType.DATE)
    private Date productCreation;
    private Double price;
    private String imagePath;
    private String imagePathTwo;
    private String imagePathThree;
    @Column(name = "chipped", columnDefinition = "BOOLEAN")
    private Boolean chipped;
    @Column(name = "gender", columnDefinition = "BOOLEAN")
    private Boolean gender;
    @Column(name = "vaccinated", columnDefinition = "BOOLEAN")
    private Boolean vaccinated;
    @ManyToOne
    private Category category;
    //





    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Date getProductCreation() {
        return productCreation;
    }

    public void setProductCreation(Date productCreation) {
        this.productCreation = productCreation;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getProductBirth() {
        return productBirth;
    }

    public void setProductBirth(Date productBirth) {
        this.productBirth = productBirth;
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

    public String getImagePathTwo() {
        return imagePathTwo;
    }

    public void setImagePathTwo(String imagePathTwo) {
        this.imagePathTwo = imagePathTwo;
    }

    public String getImagePathThree() {
        return imagePathThree;
    }

    public void setImagePathThree(String imagePathThree) {
        this.imagePathThree = imagePathThree;
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

    @Override
    public String toString() {
        return "Products{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productBirth=" + productBirth +
                ", productCreation=" + productCreation +
                ", price=" + price +
                ", imagePath='" + imagePath + '\'' +
                ", imagePathTwo='" + imagePathTwo + '\'' +
                ", imagePathThree='" + imagePathThree + '\'' +
                ", chipped=" + chipped +
                ", gender=" + gender +
                ", vaccinated=" + vaccinated +
                ", category=" + category +
                '}';

    }

    public Boolean getChipped() {
        return chipped;
    }

    public void setChipped(Boolean chipped) {
        this.chipped = chipped;
    }


}
