package com.ecommerce.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "cart_items")
    private Set<CartItem> cartItems = new HashSet<>();

    @Column(name = "total_prices")
    private float totalPrices;

    @Column(name = "total_items")
    private int totalItems;

    private int totalDiscountedPrice;

    private int discount;

    public Cart() {
    }

    public Cart(Long id, User user, Set<CartItem> cartItems, float totalPrices,
            int totalItems,
            int totalDiscountedPrice, int discount) {
        this.id = id;
        this.user = user;
        this.cartItems = cartItems;
        this.totalPrices = totalPrices;
        this.totalItems = totalItems;
        this.totalDiscountedPrice = totalDiscountedPrice;
        this.discount = discount;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<CartItem> getCartItems() {
        return this.cartItems;
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public float getTotalPrices() {
        return this.totalPrices;
    }

    public void setTotalPrices(float totalPrices) {
        this.totalPrices = totalPrices;
    }

    public int getTotalItems() {
        return this.totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getTotalDiscountedPrice() {
        return this.totalDiscountedPrice;
    }

    public void setTotalDiscountedPrice(int totalDiscountedPrice) {
        this.totalDiscountedPrice = totalDiscountedPrice;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Cart id(Long id) {
        setId(id);
        return this;
    }

    public Cart user(User user) {
        setUser(user);
        return this;
    }

    public Cart cartItems(Set<CartItem> cartItems) {
        setCartItems(cartItems);
        return this;
    }

    public Cart totalPrices(float totalPrices) {
        setTotalPrices(totalPrices);
        return this;
    }

    public Cart totalItems(int totalItems) {
        setTotalItems(totalItems);
        return this;
    }

    public Cart totalDiscountedPrice(int totalDiscountedPrice) {
        setTotalDiscountedPrice(totalDiscountedPrice);
        return this;
    }

    public Cart discount(int discount) {
        setDiscount(discount);
        return this;
    }

}
