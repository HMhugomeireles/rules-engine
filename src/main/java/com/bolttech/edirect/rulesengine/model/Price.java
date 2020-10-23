package com.bolttech.edirect.rulesengine.model;

public class Price {

    private double providerPrice;
    private double discountPercentage;
    private double discountValue;
    private double finalPrice;

    public Price(double providerPrice, double discountPercentage, double discountValue, double finalPrice) {
        this.providerPrice = providerPrice;
        this.discountPercentage = discountPercentage;
        this.discountValue = discountValue;
        this.finalPrice = finalPrice;
    }

    public double getProviderPrice() {
        return providerPrice;
    }

    public void setProviderPrice(double providerPrice) {
        this.providerPrice = providerPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    @Override
    public String toString() {
        return "Price{" +
                "providerPrice=" + providerPrice +
                ", discountPercentage=" + discountPercentage +
                ", discountValue=" + discountValue +
                ", finalPrice=" + finalPrice +
                '}';
    }
}
