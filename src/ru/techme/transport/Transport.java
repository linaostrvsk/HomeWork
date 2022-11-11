package ru.techme.transport;

public class Transport {
    int power;
    int speed;
    int weight;
    String model;

    public Transport(int power, int speed, int weight, String model) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.model = model;
    }

    public double translate(){
        return power * 0.74;
    }
}
