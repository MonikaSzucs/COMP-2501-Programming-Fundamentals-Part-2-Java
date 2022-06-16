import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(final String[] args) {
        List<Mammal> mammals;
        mammals = new ArrayList<>();
        mammals.add(new Bat());
        mammals.add(new Dog());
        mammals.add(new Dolphin());
        mammals.add(new Person());

        for(Mammal m: mammals) {
            m.move();
        }
    }
}
