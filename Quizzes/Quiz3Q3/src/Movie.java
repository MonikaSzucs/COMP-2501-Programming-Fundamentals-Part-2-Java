import java.util.Calendar;

public class Movie {
    private final String tital;
    private final int yearReleased;

    Calendar instance = Calendar.getInstance();
    int CURRENT_YEAR = instance.get(Calendar.YEAR);
    public static final int MOVIE_MADE = 1896;

    /**
     *
     * @param title the title of the movie
     * @param yearReleased the year the movie was released
     * @throws IllegalMovieDataException When the title or year released is not entered in properly
     */
    Movie(final String title, final int yearReleased) {
        if(title == null || title.isBlank()) {
            throw new IllegalMovieDataException("Invalid title");
        }

        if(yearReleased <= CURRENT_YEAR && yearReleased >= MOVIE_MADE) {
            throw new IllegalMovieDataException("Invalid year");
        }

        this.tital = title;
        this. yearReleased = yearReleased;
    }
}
