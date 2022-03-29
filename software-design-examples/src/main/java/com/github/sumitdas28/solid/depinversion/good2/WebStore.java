package com.github.sumitdas28.solid.depinversion.good2;

//High level module
public class WebStore {

    private PaymentController paymentController;

    public WebStore() {
        paymentController= new PaymentController();
        paymentController.setPaymentMethod(new Square());

    }

    public void purchaseItem(){
        paymentController.pay();
    }
}
