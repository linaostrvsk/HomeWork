package ru.techme.car;

import ru.techme.exception.CustomException;

import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private int coast;

    public Car(String model, int speed, int coast) {
        this.model = model;
        this.speed = speed;
        this.coast = coast;
    }

    public Car() {
    }

    public void start(){
        Random random = new Random();
        int i = random.nextInt(20);
        if (i % 2 == 0){
            throw new CustomException();
        } else {
            System.out.println("Автомобиль " + model + " завёлся ");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", coast=" + coast +
                '}';
    }
}
