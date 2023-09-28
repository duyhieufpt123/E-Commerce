package com.ecommerce.request;

public class AddItemRequest {

    private Long productId;
    private String size;
    private int quantity;
    private Integer price;

    public AddItemRequest() {
    }

    public AddItemRequest(Long productId, String size, int quantity, Integer price) {
        this.productId = productId;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public AddItemRequest productId(Long productId) {
        setProductId(productId);
        return this;
    }

    public AddItemRequest size(String size) {
        setSize(size);
        return this;
    }

    public AddItemRequest quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

    public AddItemRequest price(Integer price) {
        setPrice(price);
        return this;
    }

}
