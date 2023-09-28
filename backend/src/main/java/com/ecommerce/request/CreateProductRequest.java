package com.ecommerce.request;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.ecommerce.model.Size;

public class CreateProductRequest {
    private String title;

    private String description;

    private int price;

    private int discountedPrice;

    private int discountPercent;

    private int quantity;

    private String brand;

    private String color;

    private Set<Size> size = new HashSet<>();

    private String imageUrl;

    private String topLevelCategory;
    private String secondLevelCategory;
    private String thirdLevelCategory;

    public CreateProductRequest() {
    }

    public CreateProductRequest(String title, String description, int price, int discountedPrice, int discountPercent,
            int quantity, String brand, String color, Set<Size> size, String imageUrl, String topLevelCategory,
            String secondLevelCategory, String thirdLevelCategory) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.discountPercent = discountPercent;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.imageUrl = imageUrl;
        this.topLevelCategory = topLevelCategory;
        this.secondLevelCategory = secondLevelCategory;
        this.thirdLevelCategory = thirdLevelCategory;
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

    public int getDiscountPercent() {
        return this.discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
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

    public Set<Size> getSize() {
        return this.size;
    }

    public void setSize(Set<Size> size) {
        this.size = size;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTopLevelCategory() {
        return this.topLevelCategory;
    }

    public void setTopLevelCategory(String topLevelCategory) {
        this.topLevelCategory = topLevelCategory;
    }

    public String getSecondLevelCategory() {
        return this.secondLevelCategory;
    }

    public void setSecondLevelCategory(String secondLevelCategory) {
        this.secondLevelCategory = secondLevelCategory;
    }

    public String getThirdLevelCategory() {
        return this.thirdLevelCategory;
    }

    public void setThirdLevelCategory(String thirdLevelCategory) {
        this.thirdLevelCategory = thirdLevelCategory;
    }

    public CreateProductRequest title(String title) {
        setTitle(title);
        return this;
    }

    public CreateProductRequest description(String description) {
        setDescription(description);
        return this;
    }

    public CreateProductRequest price(int price) {
        setPrice(price);
        return this;
    }

    public CreateProductRequest discountedPrice(int discountedPrice) {
        setDiscountedPrice(discountedPrice);
        return this;
    }

    public CreateProductRequest discountPercent(int discountPercent) {
        setDiscountPercent(discountPercent);
        return this;
    }

    public CreateProductRequest quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

    public CreateProductRequest brand(String brand) {
        setBrand(brand);
        return this;
    }

    public CreateProductRequest color(String color) {
        setColor(color);
        return this;
    }

    public CreateProductRequest size(Set<Size> size) {
        setSize(size);
        return this;
    }

    public CreateProductRequest imageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    public CreateProductRequest topLevelCategory(String topLevelCategory) {
        setTopLevelCategory(topLevelCategory);
        return this;
    }

    public CreateProductRequest secondLevelCategory(String secondLevelCategory) {
        setSecondLevelCategory(secondLevelCategory);
        return this;
    }

    public CreateProductRequest thirdLevelCategory(String thirdLevelCategory) {
        setThirdLevelCategory(thirdLevelCategory);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreateProductRequest)) {
            return false;
        }
        CreateProductRequest createProductRequest = (CreateProductRequest) o;
        return Objects.equals(title, createProductRequest.title)
                && Objects.equals(description, createProductRequest.description) && price == createProductRequest.price
                && discountedPrice == createProductRequest.discountedPrice
                && discountPercent == createProductRequest.discountPercent && quantity == createProductRequest.quantity
                && Objects.equals(brand, createProductRequest.brand)
                && Objects.equals(color, createProductRequest.color) && Objects.equals(size, createProductRequest.size)
                && Objects.equals(imageUrl, createProductRequest.imageUrl)
                && Objects.equals(topLevelCategory, createProductRequest.topLevelCategory)
                && Objects.equals(secondLevelCategory, createProductRequest.secondLevelCategory)
                && Objects.equals(thirdLevelCategory, createProductRequest.thirdLevelCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, price, discountedPrice, discountPercent, quantity, brand, color, size,
                imageUrl, topLevelCategory, secondLevelCategory, thirdLevelCategory);
    }

    @Override
    public String toString() {
        return "{" +
                " title='" + getTitle() + "'" +
                ", description='" + getDescription() + "'" +
                ", price='" + getPrice() + "'" +
                ", discountedPrice='" + getDiscountedPrice() + "'" +
                ", discountPercent='" + getDiscountPercent() + "'" +
                ", quantity='" + getQuantity() + "'" +
                ", brand='" + getBrand() + "'" +
                ", color='" + getColor() + "'" +
                ", size='" + getSize() + "'" +
                ", imageUrl='" + getImageUrl() + "'" +
                ", topLevelCategory='" + getTopLevelCategory() + "'" +
                ", secondLevelCategory='" + getSecondLevelCategory() + "'" +
                ", thirdLevelCategory='" + getThirdLevelCategory() + "'" +
                "}";
    }

}