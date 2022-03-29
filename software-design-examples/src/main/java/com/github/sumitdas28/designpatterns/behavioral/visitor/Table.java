package com.github.sumitdas28.designpatterns.behavioral.visitor;

public class Table implements ShoppingItem{
    private String sku;
    private String type;
    private double price;

    public Table(String sku, String type, double price) {
        this.sku = sku;
        this.type = type;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
