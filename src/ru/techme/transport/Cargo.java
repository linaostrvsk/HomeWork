package ru.techme.transport;

public class Cargo extends Ground{
    int capacity;


    public Cargo(int power, int speed, int weight, String model, int wheels, int fuel, int capacity) {
        super(power, speed, weight, model, wheels, fuel);
        this.capacity = capacity;
    }
    public void printInfo (int weight){
        if (capacity >= weight){
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Нужен грузовик больше");
        }

    }
}
