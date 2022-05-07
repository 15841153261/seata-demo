package com.example.seatastorageservice.controller;

import com.example.seatastorageservice.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public void decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
    }
}

