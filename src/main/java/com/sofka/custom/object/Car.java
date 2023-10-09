package com.sofka.custom.object;

public class Car {
    public String brand;
    public int model;

    public Car(String brand, int model) {
        this.brand = brand;
        this.model = model;
    }

    public static void main(String[] args) {
        Car newCar = new Car("Mercedez", 2013);

        System.out.println(newCar);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                '}';
    }
}
