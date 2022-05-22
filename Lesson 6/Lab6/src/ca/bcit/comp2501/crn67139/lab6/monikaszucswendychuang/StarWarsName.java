package ca.bcit.comp2501.crn67139.lab6.monikaszucswendychuang;

import java.util.Locale;

/**
 * StarWarsName.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #6
 *
 * Define a StarWarsName with StarWars properties.
 *
 * @author Monika Szucs
 * @author Wendy Chuang
 *
 * @version 1.3
 *
 * To run the StarWarsName you need to go to Run > Edit Configurations then under Build and Run program arguments
 * type in: Brady|Mills|Shepherd|Chilliwack
 */
public class StarWarsName {
    private static String starWarsName;

    // Magic Numbers:
    public static final int MISSING_DATA_ARG_LEN = 0;
    public static final int NUM_OF_ARGUMENTS = 1;
    private static final int PROGRAM_ARGUMENT = 0;

    public static final int NUM_OF_WORD_STRINGS = 4;

    public static final int INDEX_ZERO    = 0;
    public static final int INDEX_ONE     = 1;
    public static final int INDEX_TWO     = 2;
    public static final int INDEX_THREE   = 3;

    /**
     * This is the Constructor that will first check if there are the right number of words given from the regex
     *
     * @param starWarsName this is the String of text given from the argument and is passed into the constructor
     * @throws IllegalArgumentException this will return an Illegal Argument message if the user did not enter the
     *                                  right number of arguments. It should be exactly 4.
     */
    public StarWarsName(final String starWarsName)
    {
        if(starWarsName.split("\\|").length != NUM_OF_WORD_STRINGS) {
            throw new IllegalArgumentException("You do not have 4 arguments to work with. Your have: " +
                    starWarsName.split("\\|").length);
        }
        this.starWarsName = starWarsName;
    }

    /**
     * This is the getter which creates the generated StarWars name and outputs it for the user to see.
     */
    public static void getStarWarsName() {
        String[] arrayNames;
        String nameSubstring1;
        String nameSubstring2;
        String nameSubstring3;
        String nameSubstring4;
        StringBuilder nameBuilder;
        String generatedName;

        arrayNames = starWarsName.split("\\|");

        nameSubstring1 = String.valueOf(arrayNames[INDEX_ZERO].toUpperCase().charAt(INDEX_ZERO) + arrayNames[INDEX_ZERO].toLowerCase().substring(INDEX_ONE,INDEX_THREE));
        nameSubstring2 = String.valueOf(arrayNames[INDEX_ONE].toLowerCase().substring(INDEX_ZERO,INDEX_TWO));
        nameSubstring3 = String.valueOf(arrayNames[INDEX_TWO].toUpperCase().charAt(INDEX_ZERO) + arrayNames[INDEX_TWO].toLowerCase().substring(INDEX_ONE,INDEX_TWO));
        nameSubstring4 = String.valueOf(arrayNames[INDEX_THREE].toLowerCase().substring(INDEX_ZERO,INDEX_THREE));

        nameBuilder = new StringBuilder();
        nameBuilder.append(nameSubstring1);
        nameBuilder.append(nameSubstring2);
        nameBuilder.append(" ");
        nameBuilder.append(nameSubstring3);
        nameBuilder.append(nameSubstring4);

        generatedName = nameBuilder.toString();

        System.out.format(generatedName);
    }

    /**
     * The main for the StarWarsName Class
     *
     * Add this to the run > Edit Configurations below:
     * Brady|Mills|Shepherd|Chilliwack
     *
     * @param args grabbing the arguments provided to create the Star Wars name
     * @IllegalArgumentException  this exception is used to check if the argument provided is out of bounds. If it
     *                              does not contain ONE argument then this exception will be thrown.
     */
    public static void main(final String[] args)
    {
        if(args.length == MISSING_DATA_ARG_LEN) {
            throw new IllegalArgumentException("The argument must be 1");
        } if(args.length != NUM_OF_ARGUMENTS) {
            throw new IllegalArgumentException("You did not enter in only one argument.");
        }
        StarWarsName starWarsName;
        starWarsName = new StarWarsName(args[PROGRAM_ARGUMENT]);

        getStarWarsName();
    }
}
