package com.mlisena.order.dto.request;

public record OrderRequest(
        String skuCode,
        Integer quantity,
        double price
) { }
