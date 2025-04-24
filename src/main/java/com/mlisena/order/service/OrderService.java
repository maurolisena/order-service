package com.mlisena.order.service;

import com.mlisena.order.dto.mapper.OrderMapper;
import com.mlisena.order.dto.request.OrderRequest;
import com.mlisena.order.entity.Order;
import com.mlisena.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = OrderMapper.toEntity(orderRequest);
        orderRepository.save(order);
        log.info("Order placed successfully: {}", order);
    }
}
