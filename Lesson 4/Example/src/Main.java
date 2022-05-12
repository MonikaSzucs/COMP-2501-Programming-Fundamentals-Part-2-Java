public class Main {
    public static void main(final String[] args) {
        Restaurant r = new Restaurant();

        try {
            r.order("pizza");
            r.order("salad");
        }
        catch(final IllegalArgumentException e) {
            System.out.println("Oh no");
        }
        finally {
            System.out.println("Always done");
        }
    }
}
