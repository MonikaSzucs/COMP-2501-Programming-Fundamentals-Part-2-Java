public class Main {

    // DO NOT DO THIS
    // public static void main(final String[] args) throws PizzaException {
    public static void main(final String[] args) {
        Restaurant r;
        r = new Restaurant();

        try {
            r.order("pizza");
            r.order("salad");
        } catch(final PizzaException e) {
            System.out.println(e.getMessage());
            System.out.println("This is a PizzaException");
        } finally {
            System.out.println("Always done");
        }

        // or you also do not need to try/catch when it is a unchecked exception

        r.order("pizza");
        r.order("salad");
    }
}
