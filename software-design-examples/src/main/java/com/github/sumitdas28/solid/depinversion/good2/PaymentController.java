package com.github.sumitdas28.solid.depinversion.good2;

// this is the pure abstract layer
public class PaymentController {
    private PaymentMethod paymentMethod;

    public PaymentController() {
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentController(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(){
        paymentMethod.pay();
    }
}
