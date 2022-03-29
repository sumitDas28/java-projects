package com.github.sumitdas28.designpatterns.servicelocator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cache {

    private List<Service> serviceList;

    public Cache() {
        this.serviceList = new ArrayList<>();
    }

    public Service getService(String jndiName){
        List<Service> filteredList = this.serviceList.stream()
                .filter(x -> x.getName().equals(jndiName))
                .collect(Collectors.toList());
        if(filteredList.size()>0){
            return filteredList.get(0);
        } else {
            return null;
        }
    }


    public void addService(Service service){
        this.serviceList.add(service);
    }
}
