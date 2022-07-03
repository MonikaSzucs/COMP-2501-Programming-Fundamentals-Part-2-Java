public class SodaPop extends Drink{
    private double gramsOfSugar;

    public SodaPop(final String name, final double milliliters, final double gramsOfSugar) {
        super(name, milliliters);
        this.gramsOfSugar = gramsOfSugar;
    }

    public void setGramsOfSugar(double gramsOfSugar) {
        this.gramsOfSugar = gramsOfSugar;
    }

    public double getGramsOfSugar() {
        return gramsOfSugar;
    }

    @Override
    public String toString() {
        return "SodaPop{" +
                "gramsOfSugar=" + gramsOfSugar +
                '}';
    }
}
