public class Main {

    // DO NOT DO THIS though it will work but don't do this it is better to do it in a try/catch
    // public static void main(final String[] args) throws PizzaException { -- this is not in a try/catch
    public static void main(final String[] args) {
        Restaurant r;
        r = new Restaurant();

        // since this is a checked exception this must be in a try/catch
        try {
            r.order("pizza");
            r.order("salad");
        } catch (final PizzaException e) {
            System.out.println(e.getMessage());
            System.out.println("This is a PizzaException");
        } finally {
            System.out.println("Always done");
        }
    }
}
