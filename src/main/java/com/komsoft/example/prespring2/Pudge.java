package com.komsoft.example.prespring2;

public class Pudge implements Hero {
    private String name;
    private int level;
    private Item heroItem;

    public Pudge(String name, int level, Item heroItem) {
        this.name = name;
        this.level = level;
        this.heroItem = heroItem;
    }

    @Override
    public Item getItem() {
        return heroItem;
    }

    @Override
    public void setHeroItem(Item item) {
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public void setLevel(int level) {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Pudge{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", item=" + heroItem +
                '}';
    }
}
