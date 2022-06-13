class Dog extends Mammal {
    private String name;

    Dog(final double kg, final String name) {
        //super(kg, 5);
        super(kg);
        this.name = name;
        System.out.println(this.getWeightKg());
    }

    public void bark() {
        System.out.println("woof!");
    }
}
