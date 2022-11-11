package ru.techme.transport;

public class Military extends Fly{
    boolean ejection;
    int rocket;

    public Military(int power, int speed, int weight, String model, int wingspan, int length, boolean ejection, int rocket) {
        super(power, speed, weight, model, wingspan, length);
        this.ejection = ejection;
        this.rocket = rocket;
    }
    public void printRocket (){
        if (rocket > 0){
            System.out.println(" Ракета пошла ");
        }else {
            System.out.println("Боеприпасов нет");
        }
    }
    public void printEjection (){
        if (ejection){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
