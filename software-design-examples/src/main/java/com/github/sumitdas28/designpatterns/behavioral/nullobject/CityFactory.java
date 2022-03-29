package com.github.sumitdas28.designpatterns.behavioral.nullobject;

public class CityFactory {

    private CityRepository cityRepository;

    public CityFactory() {
        this.cityRepository = new CityRepository();
    }

    public AbstractCity getCity(String cityName){
        if(checkCity(cityName)){
            return new RealCity(cityName);
        }
        return new NullCity();
    }

    private boolean checkCity(String cityName) {
        if(cityRepository.existCity(cityName)){
            return true;
        } else{
            return false;
        }
    }
}
