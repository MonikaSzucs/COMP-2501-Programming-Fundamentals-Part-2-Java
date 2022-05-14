package ca.bcit.comp2501.crn67139.monikaszucsruisitang;

import java.util.Calendar;

/**
 * Person.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #5
 *
 * Define a Person class that will grab their first name, last name, birth year, marriage status, weight in pounds,
 * and highest education level
 *
 * @author Monika Szucs
 * @author Ruisi Tang
 *
 * @version 1.0
 *
 */
class Person {
    private final String    firstName;
    private final String    lastName;
    private final int       birthYear;
    private final String    married;
    private final double    weightInPounds;
    private final String    highestEducationLevel;

    //static LocalDate currentDate            = LocalDate.now();
    //static int currentYear                  = currentDate.getYear();
    //public static final int CURRENT_YEAR    = currentYear;

    Calendar instance = Calendar.getInstance();
    int CURRENT_YEAR = instance.get(Calendar.YEAR);



    public static final double POUNDS_TO_KILOGRAMS = 0.4545;

    /**
     * The Person constructor containing all six of the instance variables
     * contains the person's data records
     *
     * @param firstName the first name of the person (String)
     * @param lastName the last name of the person (String)
     * @param birthYear the birth year of the person (int)
     * @param married the marriage status of the person (String)
     * @param weightInPounds the persons weight in pounds (double)
     * @param highestEducationLevel the persons highest level of education (String)
     *
     * @throws IllegalArgumentException throws an illegal argument if the marriage or high school education level
     *                          is not set properly
     */
    Person(final String firstName, final String lastName, final int birthYear, final String married,
           final double weightInPounds, final String highestEducationLevel) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.birthYear  = birthYear;

        if(!isValidMarriageStatus(married)) {
            throw new IllegalArgumentException("Must have a married status of yes, no, or divorced");
        }
        this.married        = married;
        this.weightInPounds = weightInPounds;

        if(isValidEducationLevel(highestEducationLevel)) {
            this.highestEducationLevel = highestEducationLevel;
        } else {
            throw new IllegalArgumentException("Must be high school, undergraduate, or graduate level of education");
        }
    }

    /**
     * The Person constructor that takes in five of the instance variables
     *
     * @param firstName the persons first name (String)
     * @param lastName the persons last name (String)
     * @param married the marriage status of the person (String)
     * @param weightInPounds the persons weight in pounds (double)
     * @param highestEducationLevel the persons highest education level (String)
     *
     * @throws IllegalArgumentException throws an illegal argument if the marriage or high school education level
     *      *                          is not set properly
     */
    Person(final String firstName, final String lastName, final String married, final double weightInPounds,
           final String highestEducationLevel) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.birthYear  = CURRENT_YEAR;

        if(!isValidMarriageStatus(married)) {
            throw new IllegalArgumentException("Must have a married status of yes, no, or divorced");
        }
        this.married        = married;
        this.weightInPounds = weightInPounds;

        if(isValidEducationLevel(highestEducationLevel)) {
            this.highestEducationLevel = highestEducationLevel;
        } else {
            throw new IllegalArgumentException("Must be high school, undergraduate, or graduate level of education");
        }
    }

    /**
     * The Person constructor that takes in three of the instance variables
     *
     * @param firstName the persons first name (String)
     * @param lastName the persons last name (String)
     * @param weightInPounds the persons weight in pounds (double)
     */
    Person(final String firstName, final String lastName, final double weightInPounds) {
        this.firstName              = firstName;
        this.lastName               = lastName;
        this.birthYear              = CURRENT_YEAR;
        this.married                = "no";
        this.weightInPounds         = weightInPounds;
        this.highestEducationLevel  = "high school";
    }

    /**
     * The getter for the persons first name
     *
     * @return the persons first name (String)
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * The getter for the persons last name
     *
     * @return the persons first name (String)
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * The getter for the persons birth year
     *
     * @return the persons birth year (int)
     */
    public int getBirthYear() {
        return  birthYear;
    }

    /**
     * The getter for the person's marriage status
     *
     * @return the person's marriage status whether it is divorced, married or single (String)
     */
    public String isMarried() {
        if(married.equalsIgnoreCase("divorced")) {
            return "divorced";
        } else if(married.equalsIgnoreCase("yes")) {
            return "married";
        } else if(married.equalsIgnoreCase("no")) {
            return "single";
        } else {
            return "not a valid married type";
        }
    }

    /**
     * The getter for the persons weight in pounds
     *
     * @return the persons weight in pounds (double)
     */
    public double getWeightInPounds() {
        return weightInPounds;
    }

    /**
     * The getter that checks the persons highest education level
     *
     * @return the highest education as graduate/undergraduate degree or high school diploma
     */
    public String getHighestEducationLevel() {
        if(highestEducationLevel.toLowerCase().equals("graduate")) {
            return "graduate degree!";
        } else if(highestEducationLevel.toLowerCase().equals("undergraduate")) {
            return "undergraduate degree!";
        } else if(highestEducationLevel.toLowerCase().equals("high school")) {
            return "high school diploma!";
        } else {
            return "invalid degree";
        }
    }

    /**
     * The method that is checking to see if the marriage status is valid
     *
     * @param marriedStatus checks to see if the marriage status is yes, no, or divorced (String)
     * @return either true or false (boolean)
     */
   private boolean isValidMarriageStatus(String marriedStatus) {
        if(     marriedStatus.equals("yes") ||
                marriedStatus.equals("no") ||
                marriedStatus.equals("divorced")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The method that is checking for a valid education level
     *
     * @param educationLevelToVerify gets the education level that is passed in the parameter (String)
     * @return if the education level is true or false (boolean)
     */
    private boolean isValidEducationLevel(String educationLevelToVerify) {
        if(     educationLevelToVerify.equalsIgnoreCase("undergraduate") ||
                educationLevelToVerify.equalsIgnoreCase("graduate") ||
                educationLevelToVerify.equalsIgnoreCase("high school")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The method ise used to print the Person detailed when there are no parameters passed
     */
    private void printDetails() {
            System.out.println(firstName + " " + lastName + " (" + isMarried() +") was born in " + birthYear + "," +
                    " weighs " + weightInPounds + " pounds, and has an " + getHighestEducationLevel());
    }

    /**
     * The method is used to print the Person details when there is one parameter passed
     *
     * @param kilograms the weight of the person in kilgrams (double)
     */
    private void printDetails(boolean kilograms) {
        if(kilograms) {
            double convertedWeightKg = POUNDS_TO_KILOGRAMS * weightInPounds;
                System.out.println(firstName + " " + lastName + " (" + isMarried() + ") was born in " + birthYear + "," +
                        " weighs " + String.format("%.1f", convertedWeightKg) + " kilograms, and has an " +
                        getHighestEducationLevel());
        }
        else {
                System.out.println(firstName + " " + lastName + " (" + isMarried() + ") was born in " + birthYear + "," +
                        " weighs " + getWeightInPounds() + " kilograms, and has an " +
                        getHighestEducationLevel());
        }
    }

    /**
     * The method is used to print the Person details when there are two parameter passed
     *
     * @param kilograms  the weight of the Person in kilograms (double)
     * @param uppercase  used to check if the name should be in uppercase (boolean)
     */
    private void printDetails(boolean kilograms, boolean uppercase) {
        double convertedWeightKg = POUNDS_TO_KILOGRAMS * weightInPounds;
        if(uppercase && kilograms) {
                System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + " (" + isMarried() + ") was born in "
                        + birthYear + "," + " weighs " + String.format("%.1f", convertedWeightKg) + " kilograms, and has an " +
                        getHighestEducationLevel());
        } else if(!uppercase && kilograms) {
                System.out.println(firstName + " " + lastName + " (" + isMarried() + ") was born in " + birthYear + "," +
                        " weighs " + String.format("%.1f", convertedWeightKg) + " kilograms, and has an " +
                        getHighestEducationLevel());
        } else if(uppercase && !kilograms) {
                System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + " (" + isMarried() + ") was born in " +
                        birthYear + "," + " weighs " + getWeightInPounds() + " pounds, and has an " +
                        getHighestEducationLevel());
        } else {
                System.out.println(firstName + " " + lastName + " (" + isMarried() + ") was born in " + birthYear + "," +
                        " weighs " + getWeightInPounds() + " pounds, and has an " + getHighestEducationLevel());
        }
    }

    /**
     * The main method used to create the Person's information and print different details
     */
    public static void main(final String[] args) {
        Person p1;
        p1 = new Person("Tiger", "Woods", 1975, "divorced", 200,
                "undergraduate");
        Person p2;
        p2 = new Person("Jason", "Harrison", 2000, "no", 180,
                "graduate");
        Person p3;
        p3 = new Person("Santa", "Claus", 1000, "yes",
                280, "high school");

        Person p4;
        p4 = new Person("Monika", "Szucs","no", 180,
                "graduate");

        Person p5;
        p5 = new Person("Ruisi", "Tang", 180);

        System.out.println("--6 parameters given for Person 1--");
        p1.printDetails();
        p1.printDetails(true);
        p1.printDetails(true, true);
        p1.printDetails(true, false);
        p1.printDetails(false, true);
        p1.printDetails(false, false);

        System.out.println("--6 parameters given for Person 2--");
        p2.printDetails();
        p2.printDetails(true);
        p2.printDetails(true,true);
        p2.printDetails(true, false);
        p2.printDetails(false, true);
        p2.printDetails(false, false);

        System.out.println("--6 parameters given for Person 3--");
        p3.printDetails();
        p3.printDetails(true);
        p3.printDetails(true,true);
        p3.printDetails(true, false);
        p3.printDetails(false, true);
        p3.printDetails(false, false);


        System.out.println("--5 parameters given for Person 4--");
        p4.printDetails();
        p4.printDetails(true);
        p4.printDetails(true,true);
        p4.printDetails(true, false);
        p4.printDetails(false, true);
        p4.printDetails(false, false);

        System.out.println("--3 parameters given for Person 5--");
        p5.printDetails();
        p5.printDetails(true);
        p5.printDetails(true,true);
        p5.printDetails(true, false);
        p5.printDetails(false, true);
        p5.printDetails(false, false);

    }
}
