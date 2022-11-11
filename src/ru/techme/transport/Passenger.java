package ru.techme.transport;

public class Passenger extends Ground{
    String body;
    int passengers;

    public Passenger(int power, int speed, int weight, String model, int wheels, int fuel, String body, int passengers) {
        super(power, speed, weight, model, wheels, fuel);
        this.body = body;
        this.passengers = passengers;
    }

    public void print (double hours){
        double way = speed * hours;
        double oil = oil(way);
        System.out.println("За время " + hours + " ч автомобиль " + model + " с максимальнойй скоростью " + speed + " проедет " + way + " км и израсходует " + oil + " литров топлива");
    }
    private double oil(double way){
        return way * (fuel / 100.0);
    }

    public String printInformation(){
        String text = "Мощность " + power + " максимальная скорость " + speed +
                " масса " + weight + " марка " + model + " тип кузова " + body +
                " количество пассажиров " + passengers + " мощность в кВ " + translate() + " количество колёс " + wheels + " расход топлива " + fuel;
        return text;

    }

}
