package ru.techme;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }
    public int dif () {
        return a - b;
    }
    public int mult () {
        return a * b;
    }
    public int div () {
        return a / b;
    }
}
