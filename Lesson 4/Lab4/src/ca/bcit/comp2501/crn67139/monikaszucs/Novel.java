package ca.bcit.comp2501.crn67139.monikaszucs;

/**
 * Novel.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #4
 *
 * Define a novel class and novels properties using Exception handling
 *
 * @author Monika Szucs
 * @author Tram Le
 *
 * @version 2.0
 *
 * To run the BookStore you need to go to Run > Edit Configurations then under Build and Run program arguments type in "Amazon"
 */
public class Novel {
    private final String    title;
    private final String    authorName;
    private final int       yearPublished;

    /**
     * The Novel object constructor
     *
     * @param title             The novel title
     * @param authorName        The novel's author name
     * @param yearPublished     The year the novel was published
     */
    public Novel(final String title, final String authorName, final int yearPublished) {
        this.title          = title;
        this.authorName     = authorName;
        this.yearPublished  = yearPublished;
    }

    /**
     * Getter for the title
     *
     * @return the title for the novel (String)
     */
    public String getTitle() {
        return title;
    }

    /**
     * The getter for the author name
     *
     * @return author name containing the author name (String)
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * The getter for the year published
     *
     * @return the year published containing the year (Integer)
     */
    public int getYearPublished() {
        return yearPublished;
    }
}
