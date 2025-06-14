package com.example.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StockApplication {

    @GetMapping("/great")

    public String great() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }

}
