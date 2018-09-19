package com.company.cars;

public class Car {
    String model;
    double capacity;
    Type type;

    public Car(String model, double capacity, Type type) {
        this.model = model;
        this.capacity = capacity;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public double getCapacity() {
        return capacity;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
