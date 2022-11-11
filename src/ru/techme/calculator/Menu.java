package ru.techme.calculator;

import java.util.Scanner;

public class Menu {
    public void menu (){
        while (true) {
            System.out.println("Меню");
            System.out.println("Нажмите 1 для входа");
            System.out.println("Нажмите 2 для выхода");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == 2) {
                System.out.println("Выход");
                break;
            }
            System.out.println("Введите первое число ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число ");
            int b = scanner.nextInt();
            System.out.println("Введите математическую операцию");
            String c = scanner.next();
            System.out.println("Результат ");
            System.out.println(result(a, b, c));
        }
    }

    private int result(int a, int b, String c){
        switch (c){
            case "+":
                return new Sum().action(a, b);
            case "-":
                return new Diff().action(a, b);
            case "/":
                return new Div().action(a, b);
            case "*":
                return new Multi().action(a, b);
            default:
                throw new RuntimeException("неверная операция");
        }
    }

//    private int resultIf(int a, int b, String c){
//        if (c.equals("+")){
//            return new Sum().action(a, b);
//        }
//        else if (c.equals("-")){
//            return new Diff().action(a, b);
//        }
//        else if (c.equals("/")){
//            return new Div().action(a, b);
//        }
//        else if (c.equals("*")){
//            return new Multi().action(a, b);
//        } else {
//            throw new RuntimeException("неверная операция");
//        }

    }
}
