package com.github.sumitdas28.solid.depinversion.good2;

public class Square implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Item purchased using Square");
    }
}
