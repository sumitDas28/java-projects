package com.github.sumitdas28.solid.depinversion.good2;

public class PayPal implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Item purchased using PayPal");
    }
}
