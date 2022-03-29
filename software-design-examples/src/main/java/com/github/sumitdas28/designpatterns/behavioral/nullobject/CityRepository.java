package com.github.sumitdas28.designpatterns.behavioral.nullobject;

import java.util.Arrays;
import java.util.List;

public class CityRepository {

    private List<String> cities;

    public CityRepository() {
        this.cities = Arrays.asList("Tokyo", "London", "Berlin", "Paris");
    }

    public boolean existCity(String city){
         return cities.stream()
                .anyMatch(x -> x.equals(city));
    }
}
