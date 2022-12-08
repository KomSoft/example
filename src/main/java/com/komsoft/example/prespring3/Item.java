package com.komsoft.example.prespring3;

import org.springframework.stereotype.Component;

@Component
public class Item {
    private String nameOfItem = "Item";

    public void setNameOfItem(String name) {
        this.nameOfItem = name;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nameOfItem='" + nameOfItem + '\'' +
                '}';
    }
}
