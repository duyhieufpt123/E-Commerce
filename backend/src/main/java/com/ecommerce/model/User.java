package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String role;
    private String mobile;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Address> address = new ArrayList<>();

    @Embedded
    @ElementCollection
    @CollectionTable(name = "payment_information", joinColumns = @JoinColumn(name = "user_id"))
    private List<PaymentInfomation> paymentInfomations = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Rating> ratings = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    private LocalDateTime createAt;

    public User() {

    }

    public User(Long id, String firstName, String lastName, String password, String email, String role, String mobile,
            List<Address> address, List<PaymentInfomation> paymentInfomations, List<Rating> ratings,
            List<Review> reviews, LocalDateTime createAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.role = role;
        this.mobile = mobile;
        this.address = address;
        this.paymentInfomations = paymentInfomations;
        this.ratings = ratings;
        this.reviews = reviews;
        this.createAt = createAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<Address> getAddress() {
        return this.address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<PaymentInfomation> getPaymentInfomations() {
        return this.paymentInfomations;
    }

    public void setPaymentInfomations(List<PaymentInfomation> paymentInfomations) {
        this.paymentInfomations = paymentInfomations;
    }

    public List<Rating> getRatings() {
        return this.ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public User id(Long id) {
        setId(id);
        return this;
    }

    public User firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public User lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User role(String role) {
        setRole(role);
        return this;
    }

    public User mobile(String mobile) {
        setMobile(mobile);
        return this;
    }

    public User address(List<Address> address) {
        setAddress(address);
        return this;
    }

    public User paymentInfomations(List<PaymentInfomation> paymentInfomations) {
        setPaymentInfomations(paymentInfomations);
        return this;
    }

    public User ratings(List<Rating> ratings) {
        setRatings(ratings);
        return this;
    }

    public User reviews(List<Review> reviews) {
        setReviews(reviews);
        return this;
    }

    public User createAt(LocalDateTime createAt) {
        setCreateAt(createAt);
        return this;
    }

}
