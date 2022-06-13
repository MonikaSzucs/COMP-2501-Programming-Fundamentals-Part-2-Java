// Object is the parent for this one
class Mammal {
    private double weightKg;

//    Mammal(final double weightKg, int x) {
//        this. weightKg = weightKg;
//    }

    Mammal(final double weightKg) {
        this. weightKg = weightKg;
    }

    public double getWeightKg() {
        return weightKg;
    }

//    @Override
//    public String toString() {
//        return "Mammal{" +
//                "weightKg=" + weightKg +
//                '}';
//    }

    // This code below will print out the class names beside the values instead of the parent class only
//    @Override
//    public String toString() {
//        return this.getClass().getSimpleName() + "{" +
//                "weightKg=" + weightKg +
//                '}';
//    }


// This code below will print out the class names beside the values instead of the parent class only
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "weightKg=" + weightKg +
                '}';
    }
}
