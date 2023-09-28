package com.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;

    private String size;

    private int quantity;

    private Integer price;

    private Integer discountedPrice;

    private Long userId;

    public CartItem() {
    }

    public CartItem(Long id, Cart cart, Product product, String size, int quantity, Integer price,
            Integer discountedPrice, Long userId) {
        this.id = id;
        this.cart = cart;
        this.product = product;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.userId = userId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscountedPrice() {
        return this.discountedPrice;
    }

    public void setDiscountedPrice(Integer discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public CartItem id(Long id) {
        setId(id);
        return this;
    }

    public CartItem cart(Cart cart) {
        setCart(cart);
        return this;
    }

    public CartItem product(Product product) {
        setProduct(product);
        return this;
    }

    public CartItem size(String size) {
        setSize(size);
        return this;
    }

    public CartItem quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

    public CartItem price(Integer price) {
        setPrice(price);
        return this;
    }

    public CartItem discountedPrice(Integer discountedPrice) {
        setDiscountedPrice(discountedPrice);
        return this;
    }

    public CartItem userId(Long userId) {
        setUserId(userId);
        return this;
    }

}
