package com.mlisena.order.controller;

import com.mlisena.order.dto.request.OrderRequest;
import com.mlisena.order.dto.response.OrderResponse;
import com.mlisena.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
