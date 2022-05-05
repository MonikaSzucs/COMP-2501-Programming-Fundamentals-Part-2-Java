class Car {
    private final int year;
    private final String make;
    private final String model;

    Car(final int year, final String make, final String model)
    {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public void isDriving()
    {
        System.out.println("vroom");
    }

    public static void main(final String[] args)
    {
        Car car;
        car = new Car(1963, "corvette", "stingray");
        System.out.println(car.getYear() + " " + car.getMake() + " " + car.getModel());
        car.isDriving();
    }
}
