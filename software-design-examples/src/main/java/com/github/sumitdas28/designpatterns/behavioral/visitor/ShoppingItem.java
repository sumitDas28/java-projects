package com.github.sumitdas28.designpatterns.behavioral.visitor;

public interface ShoppingItem {
    public double accept(ShoppingCartVisitor visitor);
}
