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
        mammals.add(new Pitbull(50.0, "rocky", false));

        // if you get rid of this below then it causes a class cast exception
        // when the cast (Dog) changing or coersion - when you coerse m to be a dog then that is called a cast
        // You shouldn't be doing this that often at all
        for(Mammal m: mammals) {
            if(m instanceof Dolphin) {
                Dolphin d = (Dolphin) m;
                d.swim();
            }
            System.out.println(m);
            if(m instanceof Dog) {
                Dog d = (Dog)m;
                d.bark();
            };
        }
    }

    public static void main(final String[] args) {
        Zoo zoo;
        zoo = new Zoo();
    }
}
