package ru.techme.calculator;

public class Diff implements Calculator{

    @Override
    public int action(int a, int b) {
        return a - b;
    }
}
