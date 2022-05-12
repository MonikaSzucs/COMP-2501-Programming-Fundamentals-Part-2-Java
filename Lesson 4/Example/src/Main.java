public class Main {

    // DO NOT DO THIS
    // public static void main(final String[] args) throws PizzaException {
    public static void main(final String[] args) {
        Restaurant r = new Restaurant();

        try {
            r.order("pizza");
            r.order("salad");
        } catch (final IllegalArgumentException e) {
            System.out.println("Oh no");
        } catch (final PizzaException e) {
            System.out.println(e.getMessage());
            System.out.println("This is a PizzaException");
        } finally {
            System.out.println("Always done");
        }
    }
}
