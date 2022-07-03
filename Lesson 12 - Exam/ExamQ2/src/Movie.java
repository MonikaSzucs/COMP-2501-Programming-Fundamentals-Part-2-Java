import java.util.ArrayList;

/**
 * Movie.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Quiz Question 2
 *
 * Create a Java class to model a Movie
 *
 * @author Monika Szucs
 * @version 1.0
 *
 */
public class Movie {
    public static final int MIN_MOVIE_TITLE_LENGTH = 10;

    private String title;

    /**
     * This is the constructor of the Movie Class
     *
     * @param title the title of the movie as a String
     */
    public Movie(final String title) {
        setTitle(title);
    }

    /**
     * This is the setter for the title.
     *
     * @param title the title of the movie as a String
     * @NullPointerException this throws an error if the title is null
     * @IllegalArgumentException this throws an error if the title is empty
     */
    public void setTitle(final String title) {
        if(title == null) {
            throw new NullPointerException("The title cannot be null");
        } else if(title.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be empty");
        }
        this.title = title;
    }

    public ArrayList<Movie> getMoviesWithLongTitles(final Movie[] movies) {
        ArrayList<Movie> allMovies;
        allMovies = new ArrayList<>();

        for(Movie movie: movies) {
            if(movie.length > MIN_MOVIE_TITLE_LENGTH) {
                movie.put(movieId, movie);
            }
        }

        return allMovies;
    }

    /**
     * This is the getter for the title
     *
     * @return this will return the title in a String format
     */
    public String getTitle() {
        return title;
    }
}
