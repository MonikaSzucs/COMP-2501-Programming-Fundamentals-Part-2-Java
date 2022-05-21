package ca.bcit.comp2501.crn67139.lab6.monikaszucswendychuang;

/**
 * StarWarsName.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #6
 *
 * Define a novel class and novels properties.
 *
 * @author Monika Szucs
 * @author Wendy Chuang
 *
 * @version 1.2
 *
 * To run the StarWarsName you need to go to Run > Edit Configurations then under Build and Run program arguments
 * type in: Brady|Mills|Shepherd|Chilliwack
 */
public class StarWarsName {
    private String starWarsName;

    // Magic Numbers:
    private static final int DATA_ARG = 0;

    private final int COUNTER_ZERO    = 0;
    private final int COUNTER_ONE     = 1;
    private final int COUNTER_TWO     = 2;
    private final int COUNTER_THREE   = 3;
    private final int COUNTER_FOUR    = 4;
    private final int COUNTER_FIVE    = 5;

    /**
     * The constructor for the StarWarsName Class
     *
     * @param starWarsName grabbing the 4 names provided to be converted into a Star Wars name (String)
     */
    public StarWarsName(final String starWarsName)
    {
        this.starWarsName = starWarsName;
    }

    /**
     * The setter for the Star Wars name (String)
     *
     * @param starWarsName the string provided from the argument to be converted to a Star Wars Name (String)
     */
    public void setStarWarsName(final String starWarsName)
    {
        this.starWarsName = starWarsName;
    }

    /**
     * The getter for the Star Wars name (String)
     *
     * @IllegalArgumentException this exception will check to see if there are four strings provided
     */
    public void getStarWarsName()
    {
        String[] argContainingString = starWarsName.split("\\|", COUNTER_FOUR);
        StringBuilder newFirstName = new StringBuilder();
        StringBuilder newLastName = new StringBuilder();
        int number = COUNTER_ONE;
        for (String character : argContainingString) {
            if(number == COUNTER_ONE)
            {
                newFirstName.append(character.substring(COUNTER_ZERO,COUNTER_THREE));
                number++;
            } else if(number == COUNTER_TWO)
            {
                newFirstName.append(character.substring(COUNTER_ZERO,COUNTER_TWO).toLowerCase());
                number++;
            }
            else if(number == COUNTER_THREE)
            {
                newLastName.append(character.substring(COUNTER_ZERO,COUNTER_TWO));
                number++;
            }
            else if(number == COUNTER_FOUR)
            {
                newLastName.append(character.substring(COUNTER_ZERO,COUNTER_THREE).toLowerCase());
                number++;
            }
        }

        if(number != COUNTER_FIVE) {
            throw new IllegalArgumentException("incorrect number of words provided");
        } else {
            System.out.format("Your Star Wars name is: " + newFirstName + " " + newLastName);
        }
    }

    /**
     * The main for the StarWarsName Class
     *
     * @param args grabbing the arguments provided to create the Star Wars name
     * @ArrayIndexOutOfBoundsException this exception is used to check if the argument provided is out of bounds
     *                                  then it will display the error
     */
    public static void main(final String[] args)
    {
        // Add this to the run > Edit Configurations below:
        // Brady|Mills|Shepherd|Chilliwack
        try {
            StarWarsName starWarsName;
            starWarsName = new StarWarsName(args[DATA_ARG]);
            starWarsName.getStarWarsName();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("missing data input");
        }
    }
}
