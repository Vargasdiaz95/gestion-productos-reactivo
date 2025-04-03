package com.example.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.productos")
public class ProductosApplication {

     public static void main(String[] args) {
        SpringApplication.run(ProductosApplication.class, args);
    }

}
