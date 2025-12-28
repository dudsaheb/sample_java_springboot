package com.shaik.orderservice.model;

public class Order {

    private Long orderId;
    private Long userId;
    private String product;

    public Order() {}

    public Order(Long orderId, Long userId, String product) {
        this.orderId = orderId;
        this.userId = userId;
        this.product = product;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getProduct() {
        return product;
    }
}
