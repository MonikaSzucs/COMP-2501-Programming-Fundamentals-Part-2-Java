public class Car {
    private final String make;
    private final String model;

    public Car(final String make, final String model) {
        this.make = make;
        this.model = model;
    }

    public void a() {
        b();
    }

    public void b() {
        c();
    }

    public void c() {
        d();
    }

    public void d() {
        System.out.println("hi");
    }

    public static void main(final String[] args) {
        Car car;
        car = new Car("honda", "accord");
        car.a();
    }

}
