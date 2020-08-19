package com.toolsguru.itemdetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {

    private @Id @GeneratedValue Long id;
    private String category_code;
    private String category_name;
    private String description;

    public Category() {
    }

    public Category(Long id, String category_code, String category_name, String description) {
        this.id = id;
        this.category_code = category_code;
        this.category_name = category_name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory_code() {
        return category_code;
    }

    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != null ? !id.equals(category.id) : category.id != null) return false;
        if (category_code != null ? !category_code.equals(category.category_code) : category.category_code != null)
            return false;
        if (category_name != null ? !category_name.equals(category.category_name) : category.category_name != null)
            return false;
        return description != null ? description.equals(category.description) : category.description == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (category_code != null ? category_code.hashCode() : 0);
        result = 31 * result + (category_name != null ? category_name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category_code='" + category_code + '\'' +
                ", category_name='" + category_name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
