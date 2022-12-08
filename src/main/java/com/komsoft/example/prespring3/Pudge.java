package com.komsoft.example.prespring3;

import org.springframework.stereotype.Component;

@Component
public class Pudge {
    private String name;
    private int level;
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
    }

    public void setName(String name) {
    }

    public void setLevel(int level) {
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Pudge{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", item=" + item +
                '}';
    }
}
