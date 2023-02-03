package com.example.domes.beans;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable

public class CategoriesPropertiesPK implements Serializable {

    @ManyToOne
    private Category category;

    @ManyToOne
    private Properties properties;
}
