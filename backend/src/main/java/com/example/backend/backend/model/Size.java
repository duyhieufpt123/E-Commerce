package com.example.backend.backend.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Size)) {
            return false;
        }
        Size size = (Size) o;
        return Objects.equals(name, size.name) && quantity == size.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", quantity='" + getQuantity() + "'" +
                "}";
    }

}
