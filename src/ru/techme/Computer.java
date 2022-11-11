package ru.techme;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int RAN;
    int HDD;
    int fullWorkCycles;
    boolean isWorking;
    boolean isBurnOut;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Computer(String processor, int RAN, int HDD, int fullWorkCycles) {
        this.processor = processor;
        this.RAN = RAN;
        this.HDD = HDD;
        this.fullWorkCycles = fullWorkCycles;
    }

    public void printInformation(){
        System.out.println("Процессор - " + processor);
        System.out.println("Оперативная память " + RAN);
        System.out.println("Жёсткий диск " + HDD);
    }

    public void turnOn(){
        if (isBurnOut){
            System.out.println("Компьютер сгорел ");
            return;
        }
        if (!isBurnOut && !isWorking && fullWorkCycles > 0){
            int scannerValue = scanner.nextInt();
            int randomValue = random.nextInt(2);
            if (scannerValue == randomValue){
                System.out.println("Компьютер включен");
                isWorking = true;
            } else {
                System.out.println("Компьютер сорел ");
                isBurnOut = true;
            }
        } else {
            System.out.println("Компьютер не рабочий ");
        }
    }
    public void turnOff() {
        if (isBurnOut){
            System.out.println("Компьютер сгорел ");
            return;
        } else if (isWorking && fullWorkCycles > 0) {
            int scannerValue = random.nextInt();
            int randomValue = random.nextInt(2);
            if(scannerValue == randomValue) {
                System.out.println("Компьютер выключен");
                isWorking = false;
                fullWorkCycles--;
            } else {
                System.out.println("Компьютер сгорел");
                isBurnOut = true;
            }
        } else {
            System.out.println("Компьютер не включен");
        }

    }
}
