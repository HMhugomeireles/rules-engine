package com.bolttech.edirect.rulesengine.model;

import com.bolttech.edirect.rulesengine.model.type.CountryType;
import com.bolttech.edirect.rulesengine.model.type.VerticalType;

public class Quote {

    private final int id;
    private final VerticalType vertical;
    private final Plan plan;
    private final CountryType country;

    public Quote(int id, VerticalType vertical, CountryType country, Plan plan) {
        this.id = id;
        this.vertical = vertical;
        this.country = country;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public VerticalType getVertical() {
        return vertical;
    }

    public Plan getPlan() {
        return plan;
    }

    public CountryType getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", vertical=" + vertical +
                ", plan=" + plan +
                '}';
    }

}
