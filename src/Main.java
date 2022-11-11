import ru.techme.Calculator;
import ru.techme.TV;
import ru.techme.transport.Cargo;
import ru.techme.transport.Civil;
import ru.techme.transport.Passenger;
import ru.techme.transport.Transport;

public class Main {
    public static void main(String[] args) {
        Passenger cargo = new Passenger(6, 1, 1, "BMW", 4, 6, "Sedan", 6);
        String s = cargo.printInformation();
        System.out.println(s);
    }
}