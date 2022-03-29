package com.github.sumitdas28.designpatterns.behavioral.visitor;

public interface ShoppingCartVisitor {
    public double visit(Table table);
    public double visit(Chair chair);
}
