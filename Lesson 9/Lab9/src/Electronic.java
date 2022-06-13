class Electronic {
    private String brand;
    private String model;
    private double price;
    private boolean powerCableAttached;

    Electronic(final String brand, final String model, final double price, final boolean powerCableAttached) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.powerCableAttached = powerCableAttached;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasPowerCableAttached() {
        return powerCableAttached;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", powerCableAttached=" + powerCableAttached +
                '}';
    }
}
