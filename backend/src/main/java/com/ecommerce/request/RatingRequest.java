package com.ecommerce.request;

public class RatingRequest {

    private Long productId;
    private double rating;

    public RatingRequest() {
    }

    public RatingRequest(Long productId, double rating) {
        this.productId = productId;
        this.rating = rating;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public RatingRequest productId(Long productId) {
        setProductId(productId);
        return this;
    }

    public RatingRequest rating(double rating) {
        setRating(rating);
        return this;
    }

}
