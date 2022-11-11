package ru.techme.transport;

public class Fly extends Transport{
    int wingspan;
    int length;

    public Fly(int power, int speed, int weight, String model, int wingspan, int length) {
        super(power, speed, weight, model);
        this.wingspan = wingspan;
        this.length = length;
    }
}
