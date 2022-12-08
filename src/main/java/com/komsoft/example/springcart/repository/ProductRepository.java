package com.komsoft.example.springcart.repository;

import com.komsoft.example.springcart.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    List<Product> list;

    public ProductRepository() {
        list = new ArrayList<>();
        list.add(new Product("Flash Verbatim", 5.2));
        list.add(new Product("Flash Transcend", 4.5));
        list.add(new Product("Seagate Barracuda", 100.0));
        list.add(new Product("Quantum Fireball", 95.4));
        list.add(new Product("Acer V320", 56.2));
        list.add(new Product("LG E2241", 45.2));
    }

    public List<Product> getAll() {
        return list;
    }

}
