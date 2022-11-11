package ru.techme.transport;

public class Civil extends Fly{
    int passengers;
    boolean business;

    public Civil(int power, int speed, int weight, String model, int wingspan, int length, int passengers, boolean business) {
        super(power, speed, weight, model, wingspan, length);
        this.passengers = passengers;
        this.business = business;
    }
    public void passenger (int passenge){
        if (passengers >= passenge){
            System.out.println("Самолёт загружен");
        } else {
            System.out.println(" Нужен самолёт больше");
        }
    }
}

