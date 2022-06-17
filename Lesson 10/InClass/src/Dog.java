public class Dog extends Mammal {

    // Get help from compiler - always get help from the compiler to help you when you mistyped move to something else
    // this new overridden part that gets printed is called polymorphism
    @Override
    public void move() {
        System.out.println("running..");
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }
}
