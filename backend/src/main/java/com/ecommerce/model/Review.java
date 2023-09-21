package com.ecommerce.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String review;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime createdAt;

    public Review() {
    }

    public Review(Long id, String review, Product product, User user, LocalDateTime createdAt) {
        this.id = id;
        this.review = review;
        this.product = product;
        this.user = user;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Review id(Long id) {
        setId(id);
        return this;
    }

    public Review review(String review) {
        setReview(review);
        return this;
    }

    public Review product(Product product) {
        setProduct(product);
        return this;
    }

    public Review user(User user) {
        setUser(user);
        return this;
    }

    public Review createdAt(LocalDateTime createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Review)) {
            return false;
        }
        Review review = (Review) o;
        return Objects.equals(id, review.id) && Objects.equals(review, review.review)
                && Objects.equals(product, review.product) && Objects.equals(user, review.user)
                && Objects.equals(createdAt, review.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, review, product, user, createdAt);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", review='" + getReview() + "'" +
                ", product='" + getProduct() + "'" +
                ", user='" + getUser() + "'" +
                ", createdAt='" + getCreatedAt() + "'" +
                "}";
    }

}
