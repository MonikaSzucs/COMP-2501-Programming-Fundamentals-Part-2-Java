public class Main {
    public static void main(final String[] args) {
        Movie movie;

        try {
            movie = new Movie("Groundhog Day", 1993);
        } catch(final IllegalMovieDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Good movie");
        }
    }
}
