package ca.bcit.comp2501.crn67139.monikaszucs;

/**
 * StarWarsName.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #6
 *
 * Define a novel class and novels properties.
 *
 * @author Monika Szucs
 * @author
 *
 * @version 1.0
 *
 * To run the StarWarsName you need to go to Run > Edit Configurations then under Build and Run program arguments
 * type in: Brady|Mills|Shepherd|Chilliwack
 */
public class StarWarsName {
    private String starWarsName;

    // Magic Numbers:
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
    public void setStarWarsName(String starWarsName)
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
        String[] arrOfStr = starWarsName.split("\\|", COUNTER_FOUR);
        String newFirstName = "";
        String newLastName = "";
        int number = COUNTER_ONE;
        for (String a : arrOfStr) {
            if(number == COUNTER_ONE)
            {
                newFirstName += a.substring(COUNTER_ZERO,COUNTER_THREE);
                number++;
            } else if(number == COUNTER_TWO)
            {
                newFirstName += a.substring(COUNTER_ZERO,COUNTER_TWO).toLowerCase();
                number++;
            }
            else if(number == COUNTER_THREE)
            {
                newLastName += a.substring(COUNTER_ZERO,COUNTER_TWO);
                number++;
            }
            else if(number == COUNTER_FOUR)
            {
                newLastName += a.substring(COUNTER_ZERO,COUNTER_THREE).toLowerCase();
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
            starWarsName = new StarWarsName(args[0]);
            starWarsName.getStarWarsName();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("missing data input");
        }
    }
}
