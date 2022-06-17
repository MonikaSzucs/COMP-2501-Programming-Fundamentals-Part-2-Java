public class Mammal {

    // All children can definitely have it
    // Why do we define methods in the parent if we only override them in the child
    // Why do we put it in the parent? So that all children guaranteed have it and at least they have the
    // parent's version of it
    // Why do we put it in the child then? To get the proper specific implementation of it
    // if this is void move() without public then the child can be public or default with nothing there
    public void move() {
        System.out.println("moving..");
    }

    void speak() {
        System.out.println("speaking");
    }
}
