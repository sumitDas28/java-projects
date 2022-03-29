package com.github.sumitdas28.solid.liskovsubs.bad;

public class App {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2020,"Honda","Civic");
        v1.speedUp();
        v1.slowDown();
        v1.refuel();

        Vehicle v2 = new PetrolCar(2020,"Honda","Civic");
        v2.speedUp();
        v2.slowDown();
        v2.refuel();

        //design smell
        Vehicle v3 = new ElectricCar(2020,"Tesla","Roadster");
        v3.speedUp();
        v3.slowDown();
        v3.refuel();
    }
}
