package com.github.sumitdas28.solid.depinversion.good2;

public class Stripe implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Item purchased using Stripe");
    }
}
