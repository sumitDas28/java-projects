package com.github.sumitdas28.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<ShoppingItem> shoppingItemList = new ArrayList<>();
        shoppingItemList.add(new Table("T1001","dining", 100));
        shoppingItemList.add(new Chair("C1001", "dining", 50));
        shoppingItemList.add(new Chair("C1002", "dining", 50));

        ShoppingCartVisitor shoppingCart = new ShoppingCart();
        System.out.println(shoppingItemList.stream()
                .map(x -> x.accept(shoppingCart))
                .reduce(0.0, Double::sum));
    }
}
