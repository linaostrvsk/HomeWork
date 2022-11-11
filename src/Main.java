import ru.techme.Calculator;
import ru.techme.TV;
import ru.techme.calculator.Menu;
import ru.techme.car.Car;
import ru.techme.exception.CustomException;
import ru.techme.transport.Cargo;
import ru.techme.transport.Civil;
import ru.techme.transport.Passenger;
import ru.techme.transport.Transport;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Car bmw = new Car("BMW", 200, 6700);
            bmw.start();
        } catch (RuntimeException e){
            System.out.println("Машина не завелась");
        }
        try {
            Car audi = new Car("Audi", 200, 6700);
            audi.start();
        } catch (RuntimeException e){
            System.out.println("Машина не завелась");
        }
        try {
            Car porsche = new Car("Porsche", 200, 6700);
            porsche.start();
        } catch (RuntimeException e){
            System.out.println("Машина не завелась");
        }
    }
}