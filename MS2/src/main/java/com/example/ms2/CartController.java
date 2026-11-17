package com.example.ms2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @GetMapping("/cart")
    public String cart() {
        return "Laptop added to cart";
    }
}