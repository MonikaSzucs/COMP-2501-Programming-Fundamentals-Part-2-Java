public class Bat extends Mammal {

    // Get help from compiler
    // method overloading is in one class
    // method overriding is in an inheritance hierarchy
    // method overriding you must not change the signature
    // method overloading you must  change the method signature
    @Override
    public void move() {
        System.out.println("fly..");
    }

    // since the parent does not have the same signature then it will not compile
    // @Override
    //    public void move(int x) {
    //        System.out.println("fly..");
    //    }
}
