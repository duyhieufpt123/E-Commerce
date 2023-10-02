package com.ecommerce.model;

import jakarta.persistence.Column;

public class Size {
    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private int quantity;

    public Size() {
    }

    public Size(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Size name(String name) {
        setName(name);
        return this;
    }

    public Size quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

}
