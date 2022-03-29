package com.github.sumitdas28.designpatterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Germany", "Panama", "UAE");
        Iterator<String> countryIterator = countries.iterator();
        while (countryIterator.hasNext()){
            System.out.println(countryIterator.next());
        }

        CityRepository cityRepository = new CityRepository();
        com.github.sumitdas28.designpatterns.behavioral.iterator.Iterator cityIterator = cityRepository.getIterator();
        while (cityIterator.hasNext()){
            System.out.println(cityIterator.next());
        }
    }
}
