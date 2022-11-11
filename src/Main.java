import ru.techme.Calculator;
import ru.techme.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(50, 100, 34, 100);
        tv.switc(51);
        tv.volum(true);
        System.out.println(tv);

    }
}