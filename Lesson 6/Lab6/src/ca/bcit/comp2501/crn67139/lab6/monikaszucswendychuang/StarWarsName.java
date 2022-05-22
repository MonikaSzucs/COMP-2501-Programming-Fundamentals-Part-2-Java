package ca.bcit.comp2501.crn67139.lab6.monikaszucswendychuang;

import java.util.Locale;

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
    private static String starWarsName;

    // Magic Numbers:
    public static final int MISSING_DATA_ARG_LEN = 0;
    public static final int NUM_OF_ARGUMENTS = 1;
    private static final int PROGRAM_ARGUMENT = 0;

    public static final int NUM_OF_WORD_STRINGS = 4;

    public final int COUNTER_ZERO    = 0;
    public final int COUNTER_ONE     = 1;
    public final int COUNTER_TWO     = 2;
    public final int COUNTER_THREE   = 3;
    public final int COUNTER_FOUR    = 4;
    public final int COUNTER_FIVE    = 5;

    public StarWarsName(final String starWarsName)
    {
        System.out.println(starWarsName.split("\\|").length);
        if(starWarsName.split("\\|").length != NUM_OF_WORD_STRINGS) {
            throw new IllegalArgumentException("You do not have 4 arguments to work with. Your have: " +
                    starWarsName.split("\\|").length);
        }
        this.starWarsName = starWarsName;
    }

    public static void getStarWarsName() {
        String[] arrayNames;
        String nameSubstring1;
        String nameSubstring2;
        String nameSubstring3;
        String nameSubstring4;

        //StringBuilder nameBuilder;
        String generatedName;

        //Brami Shchi
        arrayNames = starWarsName.split("\\|");

        nameSubstring1 = String.valueOf(arrayNames[0].toUpperCase().charAt(0) + arrayNames[0].toLowerCase().substring(1,3));
        nameSubstring2 = String.valueOf(arrayNames[1].toLowerCase().substring(0,2));
        nameSubstring3 = String.valueOf(arrayNames[2].toUpperCase().charAt(0) + arrayNames[2].toLowerCase().substring(1,2));
        nameSubstring4 = String.valueOf(arrayNames[3].toLowerCase().substring(0,3));

        //nameBuilder = new StringBuilder();
        //nameBuilder.append(nameSubstring1);
        //nameBuilder.append(nameSubstring2);
        //nameBuilder.append(" ");
        //nameBuilder.append(nameSubstring3);
        //nameBuilder.append(nameSubstring4);

        //System.out.println(nameBuilder);
        //generatedName = nameBuilder.toString();
        generatedName = nameSubstring1 + nameSubstring2 + " " + nameSubstring3 + nameSubstring4;
        System.out.format(generatedName);
    }

    /**
     * The main for the StarWarsName Class
     *
     * Add this to the run > Edit Configurations below:
     * Brady|Mills|Shepherd|Chilliwack
     *
     * @param args grabbing the arguments provided to create the Star Wars name
     * @ArrayIndexOutOfBoundsException this exception is used to check if the argument provided is out of bounds
     *                                  then it will display the error
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
