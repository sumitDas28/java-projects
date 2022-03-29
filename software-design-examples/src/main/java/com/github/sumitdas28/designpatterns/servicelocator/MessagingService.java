package com.github.sumitdas28.designpatterns.servicelocator;

public class MessagingService implements Service{

    public  static final String NAME="MESSAGING_SERVICE";

    @Override
    public String getName() {
        return MessagingService.NAME;
    }

    @Override
    public void execute() {
        System.out.println("Executing MessagingService...");
    }
}
