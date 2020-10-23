package com.bolttech.edirect.rulesengine.model;

public class Plan {

    private int id;
    private String name;
    private final Price price;

    public Plan(int id, String name, Price price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
