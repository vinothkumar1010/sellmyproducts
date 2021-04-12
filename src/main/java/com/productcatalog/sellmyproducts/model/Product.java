package com.productcatalog.sellmyproducts.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String productName;
    private String productDescription;

    public Product() {
    }

    public Product(String productName, String productDescription) {
        this.productName = productName;
        this.productDescription = productDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
