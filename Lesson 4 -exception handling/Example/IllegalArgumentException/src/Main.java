public class Main {

    // DO NOT DO THIS
    // public static void main(final String[] args) throws PizzaException {
    public static void main(final String[] args) {
        Restaurant r;
        r = new Restaurant();

        try {
            r.order("pizza");
            r.order("salad");
        } catch (final IllegalArgumentException e) {
            System.out.println("Oh no");
        } finally {
            // this area will always run at the very end
            System.out.println("Always done");
        }
    }
}
