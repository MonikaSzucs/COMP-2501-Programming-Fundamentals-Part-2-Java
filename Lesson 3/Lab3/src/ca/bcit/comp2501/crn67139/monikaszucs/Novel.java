package ca.bcit.comp2501.crn67139.monikaszucs;

/**
 * Novel.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #3
 *
 * Define a novel class and novels properties.
 *
 * @author Monika Szucs
 * @author Tony Tateyama
 *
 * @version 1.0
 *
 * To run the BookStore you need to go to Run > Edit Configurations then under Build and Run program arguments type in "Amazon"
 */
class Novel {
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
    Novel(final String title, final String authorName, final int yearPublished)
    {
        this.title          = title;
        this.authorName     = authorName;
        this.yearPublished  = yearPublished;
    }

    /**
     * Getter for the title
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * The getter for the author name
     *
     * @return author name
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * The getter for the year published
     *
     * @return the year published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
