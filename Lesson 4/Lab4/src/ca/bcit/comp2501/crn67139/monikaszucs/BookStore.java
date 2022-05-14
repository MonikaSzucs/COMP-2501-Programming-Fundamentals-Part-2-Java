package ca.bcit.comp2501.crn67139.monikaszucs;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * BookStore.java
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
public class BookStore {
    private final String bookStoreName;
    private final List<Novel> novels;

    private static final int TOOSHORT = 0;
    private static final int BOOKSTORE_NAME_INDEX = 0;

    /**
     * The Bookstore constructor
     * Contains the number of novel data records and bookstore name
     *
     * @param                       bookStoreName is the name of the bookstore (String)
     * @throws IllegalArgumentException    Will throw an IllegalArgumentException if there is an invalid book name that is null or blank
     */
    public BookStore(final String bookStoreName) {
        if (bookStoreName == null || bookStoreName.isBlank()) {
            throw new IllegalArgumentException("invalid book store's name");
        }

        if(bookStoreName.equalsIgnoreCase("Books-R-Us")) {
            this.bookStoreName = bookStoreName;
        } else if(bookStoreName.equals("Amazon")) {
            this.bookStoreName = "Chapters";
        } else {
            this.bookStoreName = "We do not accept the name of Amazon in any letter casing";
        }

        // Populating the ArrayList with data
        novels = new ArrayList<>();
        novels.add(null);
        novels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novels.add(new Novel("All the King's Men", "Robert Penn Warren", 1946));
        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
        novels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novels.add(new Novel(null, null, 0));
        novels.add(new Novel(null, "author name 1", 0));
        novels.add(new Novel("", null, 0));
        novels.add(new Novel(null, "", 0));
        novels.add(new Novel("title 1", null, 0));
        novels.add(new Novel("", "", 0));
        novels.add(new Novel("", "author name 2", 0));
        novels.add(new Novel("title 2", null, 0));
        novels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novels.add(new Novel("A Death in the Family", "James Agee", 1958));
        novels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novels.add(new Novel("Deliverance", "James Dickey", 1970));
        novels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novels.add(new Novel("Falconer", "John Cheever", 1977));
        novels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1963));
        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novels.add(new Novel("Herzog", "Saul Bellow", 1964));
        novels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novels.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novels.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novels.add(new Novel("Light in August", "William Faulkner", 1932));
        novels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novels.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novels.add(new Novel("Loving", "Henry Green", 1945));
        novels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novels.add(new Novel("Money", "Martin Amis", 1984));
        novels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novels.add(new Novel("Native Son", "Richard Wright", 1940));
        novels.add(new Novel("Neuromancer", "William Gibson", 1984));
        novels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novels.add(new Novel("1984", "George Orwell", 1948));
        novels.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novels.add(new Novel("Possession", "A.S. Byatt", 1990));
        novels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novels.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novels.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novels.add(new Novel("Revolutionary Road", "Richard Yatest", 1961));
        novels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novels.add(new Novel("Slaughterhouse-Fivey", "Kurt Vonnegut", 1969));
        novels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novels.add(new Novel("The Sound and the Furyr", "William Faulkner", 1929));
        novels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novels.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        novels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novels.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novels.add(new Novel("White Noise", "Don DeLillo", 1985));
        novels.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));

        System.out.println(novels.size());
        System.out.println(this.bookStoreName);
    }

    /**
     * Displays the title names containing a substring
     */
    public void printAllTitles() {
        for(Novel novel: novels) {
            if(novel != null && novel.getTitle() != null && !novel.getTitle().isBlank()) {
                System.out.println(novel.getTitle().toUpperCase());
            }
        }
    }

    /**
     * Printing all titles that contain the specified substring:
     * if caseSensitive is false then the match is in any letter casing
     * if caseSensitive is true then the match must include letter casing
     *
     * @param substring             The substring to search for
     * @param caseSensitive         checking based on case-sensitivity
     * @throws IllegalArgumentException    This checks to see if the method that has been passed is an illegal argument
     * @throws NullPointerException        This will check to see when a variable is accessed to make sure it is nothing or null
     */
    public void printTitlesContaining(final String substring,
                                      final boolean caseSensitive) {
        try {
            for(Novel novel: novels) {
                if(novel != null) {
                    if(novel.getTitle() != null) {
                        if(caseSensitive) {
                            boolean val = novel.getTitle().contains(substring);
                            if(val) {
                                if(novel.getTitle().toLowerCase().contains(substring.toLowerCase())) {
                                    System.out.println(novel.getTitle());
                                }
                            }
                        }
                        else {
                            boolean val = novel.getTitle().toLowerCase().contains(substring.toLowerCase());
                            if(val) {
                                System.out.println(novel.getTitle());
                            }
                        }
                    }
                }
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Illegal argument: " + e);
        } catch(NullPointerException e) {
            System.out.println("NullPointerException " + e);
        }
    }

    /**
     * Printing all titles that are exactly the specified length
     *
     * @param lengthCheck               grabbing the length of the title that matches
     * @throws IllegalArgumentException throws an Illegal Argument error if the length of the title is less than or equal to TOOSHORT
     */
    public void printTitlesOfLength(final int lengthCheck) {
        System.out.println(lengthCheck);
        if(lengthCheck <= TOOSHORT) {
            throw new IllegalArgumentException("bad length");
        } else {
            for(Novel novel: novels) {
                if (novel != null) {
                    if (novel.getTitle() != null &&
                            !novel.getTitle().isBlank()) {
                        if (novel.getTitle().length() == lengthCheck) {
                            System.out.println(novel.getTitle());
                        }
                    }
                }
            }
        }
    }

    /**
     * Prints all author names that either start or end with substring, in lowercase
     *
     * @param substring         the letters provided to check for
     * @throws IllegalNameException    Created a custom Exception with the message "bad name" if the parameter is null or blank
     */
    public void printNameStartsEndsWith(final String substring) throws IllegalNameException {
        if(substring == null || substring.isBlank()) {
            throw new IllegalNameException("bad name");
        } for(Novel novel: novels) {
            if (novel != null) {
                if (novel.getAuthorName() != null) {
                    if (novel.getAuthorName().length() >= 2) {
                        if (novel.getAuthorName().toLowerCase().substring(0, 2).contains(substring.toLowerCase()) ||
                                novel.getAuthorName().toLowerCase().substring(novel.getAuthorName().length() - 2).contains(substring.toLowerCase())) {
                            System.out.println(novel.getAuthorName());
                        }
                    }
                }
            }
        }
    }

    /**
     * If the property argument is “author” (in any letter casing) then return the longest author
     * name (by finding it using a foreach loop); if the property argument is “title” (in any letter casing)
     * then return the longest title (by finding it using a foreach loop);
     * if the property argument is something else then return null
     *
     * @param property                          the property of the author or title (String) that is passed into the method
     * @return                                  the longest title or author (String)
     * @throws IllegalNovelPropertyException    Created a custom Exception with the message "bad property" if the parameter
     *                                          does not contain the word author or title
     */
    public String getLongest(final String property) {
        String title;
        String name;
        int    maxLength = 0;
        String longest = null;

        if(!property.equalsIgnoreCase("author") &&
                !property.equalsIgnoreCase("title")) {
            throw new IllegalNovelPropertyException("bad property");
        }
        for(Novel novel : novels) {
            if(novel != null) {
                if(property.equalsIgnoreCase("title")) {
                    title = novel.getTitle();
                    if(title != null && !title.isBlank()) {
                        if(title.length() > maxLength) {
                            maxLength = title.length();
                            longest = title;
                        }
                    }
                } else if(property.equalsIgnoreCase("author")) {
                    name = novel.getAuthorName();
                    if(name != null && !name.isBlank()) {
                        if (name.length() > maxLength) {
                            maxLength = name.length();
                            longest = name;
                        }
                    }
                } else {
                    longest = "title or author cannot be found.";
                }
            }
        }
        return longest;
    }

    /**
     * The main which created a BookStore object and passes args[0] to BookStore constructor as its name property
     *
     * To run the BookStore you need to go to Run > Edit Configurations then under Build and Run program arguments type in "Amazon"
     *
     * @param args                      is an argument passed
     * @IllegalNameException            Created a custom Exception with the message "bad name" if the parameter is null or blank
     * @IllegalNovelPropertyException   Created a custom Exception with the message "Illegal Argument" in the try/catch
     * @IllegalArgumentException        Checks for an IllegalArgumentException
     */
    public static void main(String[] args) throws IllegalNameException {
        try {
            BookStore bookStore = new BookStore( args[BOOKSTORE_NAME_INDEX] );
            bookStore.printAllTitles();

            System.out.println("---");
            bookStore.printTitlesContaining("the", false);
            System.out.println("---");
            bookStore.printTitlesContaining("the", true);

            System.out.println("---");
            bookStore.printTitlesOfLength(13);

            System.out.println("--NameStartsEndsWith--");
            bookStore.printNameStartsEndsWith("aN");

            System.out.println("--getLongest--");
            System.out.println(bookStore.getLongest("AutHor"));
            System.out.println(bookStore.getLongest("titlE"));
            System.out.println(bookStore.getLongest("xyz"));
        } catch (IllegalNovelPropertyException  |
                IllegalNameException            |
                IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--ENDING --");
    }
}
