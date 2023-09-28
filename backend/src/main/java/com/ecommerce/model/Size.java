package com.ecommerce.model;

public class Size {

    private String name;
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
