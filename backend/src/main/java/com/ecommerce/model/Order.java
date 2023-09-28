package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "order_id")
    private String orderId;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();

    private LocalDateTime orderDate;

    private LocalDateTime deliveryDate;

    @OneToOne
    private Address shippingAddress;

    @Embedded
    private PaymentDetails paymentDetails = new PaymentDetails();

    private double totalPrice;

    private Integer totalDiscountedPrice;

    private Integer discount;

    private String orderStatus;

    private int totalItem;

    private LocalDateTime createAt;

    public Order() {
    }

    public Order(Long id, String orderId, User user, List<OrderItem> orderItems,
            LocalDateTime orderDate,
            LocalDateTime deliveryDate, Address shippingAddress, PaymentDetails paymentDetails, double totalPrice,
            Integer totalDiscountedPrice, Integer discount, String orderStatus, int totalItem, LocalDateTime createAt) {
        this.id = id;
        this.orderId = orderId;
        this.user = user;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.shippingAddress = shippingAddress;
        this.paymentDetails = paymentDetails;
        this.totalPrice = totalPrice;
        this.totalDiscountedPrice = totalDiscountedPrice;
        this.discount = discount;
        this.orderStatus = orderStatus;
        this.totalItem = totalItem;
        this.createAt = createAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public LocalDateTime getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return this.deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalDiscountedPrice() {
        return this.totalDiscountedPrice;
    }

    public void setTotalDiscountedPrice(Integer totalDiscountedPrice) {
        this.totalDiscountedPrice = totalDiscountedPrice;
    }

    public Integer getDiscount() {
        return this.discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getTotalItem() {
        return this.totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Order id(Long id) {
        setId(id);
        return this;
    }

    public Order orderId(String orderId) {
        setOrderId(orderId);
        return this;
    }

    public Order user(User user) {
        setUser(user);
        return this;
    }

    public Order orderItems(List<OrderItem> orderItems) {
        setOrderItems(orderItems);
        return this;
    }

    public Order orderDate(LocalDateTime orderDate) {
        setOrderDate(orderDate);
        return this;
    }

    public Order deliveryDate(LocalDateTime deliveryDate) {
        setDeliveryDate(deliveryDate);
        return this;
    }

    public Order shippingAddress(Address shippingAddress) {
        setShippingAddress(shippingAddress);
        return this;
    }

    public Order paymentDetails(PaymentDetails paymentDetails) {
        setPaymentDetails(paymentDetails);
        return this;
    }

    public Order totalPrice(double totalPrice) {
        setTotalPrice(totalPrice);
        return this;
    }

    public Order totalDiscountedPrice(Integer totalDiscountedPrice) {
        setTotalDiscountedPrice(totalDiscountedPrice);
        return this;
    }

    public Order discount(Integer discount) {
        setDiscount(discount);
        return this;
    }

    public Order orderStatus(String orderStatus) {
        setOrderStatus(orderStatus);
        return this;
    }

    public Order totalItem(int totalItem) {
        setTotalItem(totalItem);
        return this;
    }

    public Order createAt(LocalDateTime createAt) {
        setCreateAt(createAt);
        return this;
    }

}
