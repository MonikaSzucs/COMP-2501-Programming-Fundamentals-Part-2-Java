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

    @Override
    public String toString() {
        return "Mammal{" +
                "weightKg=" + weightKg +
                '}';
    }
}
