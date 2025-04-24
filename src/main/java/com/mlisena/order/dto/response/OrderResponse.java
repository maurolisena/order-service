package com.mlisena.order.dto.response;

public record OrderResponse(
        String orderNumber,
        String skuCode,
        Integer quantity,
        Double price
) { }
