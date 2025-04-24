package com.mlisena.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private String skuCode;
    private Integer quantity;
    private double price;

}
