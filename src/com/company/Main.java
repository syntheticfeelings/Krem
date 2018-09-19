package com.company;

import com.company.cars.Car;
import com.company.cars.Type;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("MAZDA", 1.5, Type.HATCHBACK));
        cars.add(new Car("ROADSTER", 1.7, Type.HATCHBACK));
        cars.add(new Car("OPEL", 3.5, Type.COUPE));
        cars.add(new Car("SHKODA", 2.5, Type.COUPE));
        for (Car car : cars) {
            if (car.getType().equals(Type.HATCHBACK)) {
                System.out.println(car);
            }
        }
        
    }
}
