package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    private Order order;

    @ManyToOne
    private Product product;

    private String size;

    private int quantity;

    private Integer price;

    private Integer discountedPrice;

    private Long userId;

    private LocalDateTime deliveryDate;

    public OrderItem() {
    }

    public OrderItem(Long id, Order order, Product product, String size, int quantity, Integer price,
            Integer discountedPrice, Long userId, LocalDateTime deliveryDate) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.userId = userId;
        this.deliveryDate = deliveryDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
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

    public LocalDateTime getDeliveryDate() {
        return this.deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public OrderItem id(Long id) {
        setId(id);
        return this;
    }

    public OrderItem order(Order order) {
        setOrder(order);
        return this;
    }

    public OrderItem product(Product product) {
        setProduct(product);
        return this;
    }

    public OrderItem size(String size) {
        setSize(size);
        return this;
    }

    public OrderItem quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

    public OrderItem price(Integer price) {
        setPrice(price);
        return this;
    }

    public OrderItem discountedPrice(Integer discountedPrice) {
        setDiscountedPrice(discountedPrice);
        return this;
    }

    public OrderItem userId(Long userId) {
        setUserId(userId);
        return this;
    }

    public OrderItem deliveryDate(LocalDateTime deliveryDate) {
        setDeliveryDate(deliveryDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OrderItem)) {
            return false;
        }
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id) && Objects.equals(order, orderItem.order)
                && Objects.equals(product, orderItem.product) && Objects.equals(size, orderItem.size)
                && quantity == orderItem.quantity && Objects.equals(price, orderItem.price)
                && Objects.equals(discountedPrice, orderItem.discountedPrice)
                && Objects.equals(userId, orderItem.userId) && Objects.equals(deliveryDate, orderItem.deliveryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order, product, size, quantity, price, discountedPrice, userId, deliveryDate);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", order='" + getOrder() + "'" +
                ", product='" + getProduct() + "'" +
                ", size='" + getSize() + "'" +
                ", quantity='" + getQuantity() + "'" +
                ", price='" + getPrice() + "'" +
                ", discountedPrice='" + getDiscountedPrice() + "'" +
                ", userId='" + getUserId() + "'" +
                ", deliveryDate='" + getDeliveryDate() + "'" +
                "}";
    }

}
