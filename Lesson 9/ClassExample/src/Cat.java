public class Cat extends Mammal {

    Cat(final double weightInKilograms) {
        // super must be called first
        super(weightInKilograms);

        // validation comes later
        if(weightInKilograms <= 0 || weightInKilograms > 39.6) {
            throw new IllegalArgumentException("wrong weight");
        }


    }
}
