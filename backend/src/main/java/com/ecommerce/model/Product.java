package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.cglib.core.Local;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private int price;

    @Column(name = "discounted_price")
    private int discountedPrice;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    @Embedded
    @ElementCollection
    @Column(name = "sizes")
    private Set<Size> sizes = new HashSet<>();

    @Column(name = "image_url")
    private String imageUrl;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rating> ratings = new ArrayList<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();

    @Column(name = "num_ratings")
    private int numRatings;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private LocalDateTime createdAt;

    public Product() {
    }

    public Product(Long id, String title, String description, int price, int discountedPrice, int quantity,
            String brand, String color, Set<Size> sizes, String imageUrl, List<Rating> ratings, List<Review> reviews,
            int numRatings, Category category, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
        this.sizes = sizes;
        this.imageUrl = imageUrl;
        this.ratings = ratings;
        this.reviews = reviews;
        this.numRatings = numRatings;
        this.category = category;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountedPrice() {
        return this.discountedPrice;
    }

    public void setDiscountedPrice(int discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Set<Size> getSizes() {
        return this.sizes;
    }

    public void setSizes(Set<Size> sizes) {
        this.sizes = sizes;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public int getNumRatings() {
        return this.numRatings;
    }

    public void setNumRatings(int numRatings) {
        this.numRatings = numRatings;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Product id(Long id) {
        setId(id);
        return this;
    }

    public Product title(String title) {
        setTitle(title);
        return this;
    }

    public Product description(String description) {
        setDescription(description);
        return this;
    }

    public Product price(int price) {
        setPrice(price);
        return this;
    }

    public Product discountedPrice(int discountedPrice) {
        setDiscountedPrice(discountedPrice);
        return this;
    }

    public Product quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

    public Product brand(String brand) {
        setBrand(brand);
        return this;
    }

    public Product color(String color) {
        setColor(color);
        return this;
    }

    public Product sizes(Set<Size> sizes) {
        setSizes(sizes);
        return this;
    }

    public Product imageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    public Product ratings(List<Rating> ratings) {
        setRatings(ratings);
        return this;
    }

    public Product reviews(List<Review> reviews) {
        setReviews(reviews);
        return this;
    }

    public Product numRatings(int numRatings) {
        setNumRatings(numRatings);
        return this;
    }

    public Product category(Category category) {
        setCategory(category);
        return this;
    }

    public Product createdAt(LocalDateTime createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(title, product.title)
                && Objects.equals(description, product.description) && price == product.price
                && discountedPrice == product.discountedPrice && quantity == product.quantity
                && Objects.equals(brand, product.brand) && Objects.equals(color, product.color)
                && Objects.equals(sizes, product.sizes) && Objects.equals(imageUrl, product.imageUrl)
                && Objects.equals(ratings, product.ratings) && Objects.equals(reviews, product.reviews)
                && numRatings == product.numRatings && Objects.equals(category, product.category)
                && Objects.equals(createdAt, product.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, price, discountedPrice, quantity, brand, color, sizes, imageUrl,
                ratings, reviews, numRatings, category, createdAt);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", description='" + getDescription() + "'" +
                ", price='" + getPrice() + "'" +
                ", discountedPrice='" + getDiscountedPrice() + "'" +
                ", quantity='" + getQuantity() + "'" +
                ", brand='" + getBrand() + "'" +
                ", color='" + getColor() + "'" +
                ", sizes='" + getSizes() + "'" +
                ", imageUrl='" + getImageUrl() + "'" +
                ", ratings='" + getRatings() + "'" +
                ", reviews='" + getReviews() + "'" +
                ", numRatings='" + getNumRatings() + "'" +
                ", category='" + getCategory() + "'" +
                ", createdAt='" + getCreatedAt() + "'" +
                "}";
    }

}
