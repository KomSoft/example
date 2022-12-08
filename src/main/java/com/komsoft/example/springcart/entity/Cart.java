package com.komsoft.example.springcart.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Cart extends HashMap<Product, Integer> {

    private final int DEFAULT_MAX_SIZE = 5;
    private final int maxSize;

    public Cart(int maxSize) {
        this.maxSize = maxSize;
    }

    @Autowired
    public Cart() {
        this.maxSize = DEFAULT_MAX_SIZE;
    }

    @Override
    public Integer put(Product product, Integer addQuantity) {
        int quantity = 0;
        if (this.containsKey(product)) {
            quantity = get(product) + addQuantity;
        } else {
            if (this.size() < maxSize) {
                quantity = addQuantity;
            }
        }
        if (quantity != 0) {
            return super.put(product, quantity);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Cart (size=%d)", this.size()));
        if (this.size() > 0) {
            stringBuilder.append(" {");
/*
            for (Map.Entry<Product, Integer> entry : this.entrySet()) {
                stringBuilder.append(String.format("%s, qty=%d, ", entry.getKey(), entry.getValue()));
            }
*/
            this.forEach((product, value) -> stringBuilder.append(String.format("%s, qty=%d, ", product.toString(), value)));
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }
}
