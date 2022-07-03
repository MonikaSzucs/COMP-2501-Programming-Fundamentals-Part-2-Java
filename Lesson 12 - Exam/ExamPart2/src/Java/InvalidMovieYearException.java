/**
 * InvalidMovieYearException.java
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
public class InvalidMovieYearException extends Throwable {
    /**
     * This is checking the IncalidMovieYearException
     * @param message contains the message
     */
    public InvalidMovieYearException(String message) {
        super(message);
    }
}
