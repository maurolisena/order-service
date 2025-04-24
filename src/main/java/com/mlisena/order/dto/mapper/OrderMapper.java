package com.mlisena.order.dto.mapper;

import com.mlisena.order.dto.request.OrderRequest;
import com.mlisena.order.dto.response.OrderResponse;
import com.mlisena.order.entity.Order;

import java.util.UUID;

public class OrderMapper {

    private OrderMapper() {
        // Private constructor to prevent instantiation
    }

    public static Order toEntity(OrderRequest orderRequest) {
        return Order.builder()
            .orderNumber(UUID.randomUUID().toString())
            .skuCode(orderRequest.skuCode())
            .quantity(orderRequest.quantity())
            .price(orderRequest.quantity())
        .build();
    }

    public static OrderResponse toResponse(Order order) {
        return new OrderResponse(
            order.getOrderNumber(),
            order.getSkuCode(),
            order.getQuantity(),
            order.getPrice()
        );
    }
}
