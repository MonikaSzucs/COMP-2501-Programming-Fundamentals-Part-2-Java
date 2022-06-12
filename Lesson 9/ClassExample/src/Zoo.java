import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Mammal> mammals;

    Zoo() {
        mammals = new ArrayList<>();
        mammals.add(new Dolphin(300));
        mammals.add(new Dog(30.3, "rocky"));
        mammals.add(new Cat(6.0));
        mammals.add(new Student("a00123456"));

        for(Mammal m: mammals) {
            System.out.println(m);
        }
    }

    public static void main(final String[] args) {
        Zoo zoo;
        zoo = new Zoo();
    }
}
