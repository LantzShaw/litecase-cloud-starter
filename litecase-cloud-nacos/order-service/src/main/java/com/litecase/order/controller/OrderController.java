package com.litecase.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/add")
    public String addOrder() {
        System.out.println("下单成功！");

        // restTemplate.getForObject("http://localhost:9001/stock/add/" + "2", String.class);
        // 添加ribbon负载均衡注解后可以这么写
        restTemplate.getForObject("http://credit-service/stock/add/" + "2", String.class);

        return "订单加1";
    }
}
