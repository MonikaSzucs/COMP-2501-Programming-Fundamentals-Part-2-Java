import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        List<Drink> drink;
        drink = new ArrayList<>();

        drink.add(new Alcohol("benz", 0.2, 0.5));
        drink.add(new SodaPop("pepsi", 0.2, 0.25));
    }
}
