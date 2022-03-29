package com.github.sumitdas28.solid.depinversion.good2;

public class App {
    public static void main(String[] args) {
        WebStore webStore = new WebStore();
        webStore.purchaseItem();
    }
}
