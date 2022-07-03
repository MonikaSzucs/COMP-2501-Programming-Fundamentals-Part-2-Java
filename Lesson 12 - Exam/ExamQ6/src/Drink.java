public class Drink {
    private String name;

    public Drink(final String name, final double milliliters) {
        this.name = name;
        this.milliliters = milliliters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }

    private double milliliters;



    public String getName() {
        return name;
    }

    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", milliliters=" + milliliters +
                '}';
    }
}
