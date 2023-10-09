package com.sofka;

import com.sofka.custom.object.Car;

public class Main {
    public static void main(String[] args) {
        // Primitive data types
        int primitiveInt = 42;
        char primitiveChar = 'A';
        double primitiveDouble = 3.14159265359;
        boolean primitiveBoolean = true;
        byte primitiveByte = 127;
        short primitiveShort = 32767;
        long primitiveLong = 9223372036854775807L;
        float primitiveFloat = 3.1415927f;

        // Wrapper classes
        Integer wrapperInt = 42;
        Character wrapperChar = 'A';
        Double wrapperDouble = 3.14159265359;
        Boolean wrapperBoolean = true;
        Byte wrapperByte = 127;
        Short wrapperShort = 32767;
        Long wrapperLong = 9223372036854775807L;
        Float wrapperFloat = 3.1415927f;

        Car firstCar = new Car("Mercedez", 2012);
        Car secondCar = firstCar;

        System.out.println("This is the first car: " + firstCar);
        System.out.println("This is the second car: " + secondCar);

        secondCar.brand = "Mazda";
        secondCar.model = 2020;

        System.out.println("This is the first car: " + firstCar);
        System.out.println("This is the second car: " + secondCar);




    }
}