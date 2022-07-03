import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Movie.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Exam Part 2
 *
 *
 * @author Monika Szucs
 * @version 1.1
 *
 * This Room Class that will create the ArrayList and add the appropriate items to it while displaying the
 * called information from other classes/methods
 *
 */
public class Movie extends EntertainmentMedia {
    private Map<String, String> actorsList;
    private String movieName;
    private int year;

    private static final int MIN_YEAR = 1888;
    private static final int MAX_YEAR = 2021;

    /**
     * This is the Movie Class
     *
     * @param movieName the name of the movie in String
     * @param year the year of the movie in int
     */
    public Movie(final String movieName, final int year) {
        super(movieName, year);
        actorsList = new HashMap<>();

        actorsList.put(new EntertainmentMedia("MoveName", 2000));

        if(movieName == null) {
            throw new IllegalArgumentException("Error. Should be getting an Exception for null title");
        } else if(movieName.isEmpty()) {
            throw new IllegalArgumentException("Error. Should be getting an Exception for empty title");
        }
        this.movieName = movieName;

        if(year > MIN_YEAR || year < MAX_YEAR) {
            throw new IllegalArgumentException( year + "is not a valid movie year...");
        }
        this.year = year;
    }

    /**
     * This is the setter for teh movie
     *
     * @param movieName
     * @throws IllegalArgumentException this has illegalargumentExceptions
     */
    public void setMovieName(final String movieName) {
        if(movieName == null) {
            throw new IllegalArgumentException("Error. Should be getting an Exception for null title");
        } else if(movieName.isEmpty()) {
            throw new IllegalArgumentException("Error. Should be getting an Exception for empty title");
        }
        this.movieName = movieName;
    }

    /**
     * This is the setter for the year
     *
     * @param year this checks fro teh year between MIN_YEAR and MAX_YEAR
     * @throws InvalidMovieYearException this checks for movie errors
     */
    public void setYear(int year) throws InvalidMovieYearException {
        //movies must be released between 1888 and 2021
        if(year > MIN_YEAR || year < MAX_YEAR) {
            throw new InvalidMovieYearException( year + "is not a valid movie year...");
        }
        this.year = year;
    }

    /**
     * This is the getter for the movie name
     *
     * @return will return the movie name in String format
     */
    public String getMovieName() {
        return movieName;
    }

    public int getYearReleased() {
        return year;
    }

    /**
     * This is the get actors method
     *
     * @return this will return the HashMap of actors
     */
    public HashMap<String, String> getActors() {
        HashMap<String, String> actors;
        actors = new HashMap<>();

        Set<String> setActors;
        setActors = actorsList.keySet();

        for(String actor: setActors) {
            if(actor.length() > 1) {
                actors.add(actor);
            }
        }
        actorsList.get("abc123");

        return actors;
    }

    /**
     * This is the method to add actors
     *
     * @param peopleActors this will add the actor to the actorList
     */
    public void addActor(final String peopleActors) {
        System.out.println(peopleActors);
        String[] arrayValues;
        String firstName;
        String lastName;

        arrayValues = peopleActors.split(" ");
        firstName = String.valueOf(arrayValues[0]);
        lastName = String.valueOf(arrayValues[1]);

        actorsList.put(lastName, firstName);
    }
}
