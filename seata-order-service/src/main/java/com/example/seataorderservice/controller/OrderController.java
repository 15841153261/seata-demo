package com.example.seataorderservice.controller;

import com.example.seataorderservice.domain.Order;
import com.example.seataorderservice.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")//这个浏览器只能用get请求访问，我们底层调用微服务的时候会使用PostMapping
    public void create(Order order) {
        orderService.create(order);
    }
}

