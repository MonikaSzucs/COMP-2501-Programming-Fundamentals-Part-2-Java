public class Cat extends Mammal {
    // there is a default constructor even if you do not make one here
    // Default looks like this:
    // Cat() { super(); }
    Cat(final double weightInKilograms) {
        // super must be called first
        super(weightInKilograms);

        // validation comes later
        if(weightInKilograms <= 0 || weightInKilograms > 39.6) {
            throw new IllegalArgumentException("wrong weight");
        }


    }
}
