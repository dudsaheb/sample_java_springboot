package com.shaik.orderservice.service;

import com.shaik.orderservice.client.UserDTO;
import com.shaik.orderservice.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class OrderService {

    private final WebClient webClient;

    public OrderService(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://localhost:8081").build();
    }

    public Map<String, Object> getOrderDetails(Long orderId) {

        Order order = new Order(orderId, 1L, "Laptop");

        UserDTO user = webClient.get()
                .uri("/users/{id}", order.getUserId())
                .retrieve()
                .bodyToMono(UserDTO.class)
                .block();

        return Map.of(
                "order", order,
                "user", user
        );
    }
}
