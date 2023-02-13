package com.example.domes.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable

public class CategoriesPropertiesPK implements Serializable {

    @OneToOne
    private Category category;

    @OneToOne
    private Properties properties;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriesPropertiesPK that = (CategoriesPropertiesPK) o;
        return Objects.equals(category, that.category) &&
                Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, properties);
    }
}
