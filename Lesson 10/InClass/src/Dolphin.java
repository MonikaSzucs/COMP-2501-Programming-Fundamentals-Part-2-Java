public class Dolphin extends Mammal {

    // To get proper specific implementation to run
    // Get help from compiler
    // since mammal has move as public then this method should be public too
    // If you take away public (reducing access) then you cannot have the @override here. You cannot take away access
    @Override
    public void move() {
        System.out.println("swim..");
    }
}
