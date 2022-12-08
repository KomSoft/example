package com.komsoft.example.prespring2;

public class Item {
    private String nameOfItem;

    public Item(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

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
