package ru.techme.transport;

public class Ground extends Transport {
    int wheels;
    int fuel;

    public Ground(int power, int speed, int weight, String model, int wheels, int fuel) {
        super(power, speed, weight, model);
        this.wheels = wheels;
        this.fuel = fuel;
    }
}
