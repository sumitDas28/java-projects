package com.github.sumitdas28.designpatterns.servicelocator;

public class ServiceLocator {

    private static Cache cache = new Cache();

    public static Service getService(String jndiName){
        Service service = cache.getService(jndiName);
        if(service!=null){
            return service;
        }
        InitialContext initialContext = new InitialContext();
        Service newService = (Service) initialContext.lookup(jndiName);
        cache.addService(newService);
        return newService;
    }
}
