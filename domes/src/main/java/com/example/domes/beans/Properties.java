package com.example.domes.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProperty;

    private String propertyName;

    @OneToMany
    private List<PropertyValue> valueList;

    public Long getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(Long idProperty) {
        this.idProperty = idProperty;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
