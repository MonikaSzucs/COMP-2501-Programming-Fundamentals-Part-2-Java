public class Alcohol extends Drink {
    private double percentageAlcohol;

    public Alcohol(final String name, final double milliliters, final double percentageAlcohol) {
        super(name, milliliters);
        this.percentageAlcohol = percentageAlcohol;
    }

    public double getPercentageAlcohol() {
        return percentageAlcohol;
    }

    public void setPercentageAlcohol(double percentageAlcohol) {
        this.percentageAlcohol = percentageAlcohol;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "percentageAlcohol=" + percentageAlcohol +
                '}';
    }
}
