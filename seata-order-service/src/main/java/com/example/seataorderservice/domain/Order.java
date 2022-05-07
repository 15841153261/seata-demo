package com.example.seataorderservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    Long id;

    Long userId;

    Long productId;

    Integer count;

    BigDecimal money;

    Integer status;
}
