import java.time.LocalDate;
import java.util.Locale;

/**
 * Person.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #5
 *
 * Define a Person class that will grab their first name, last name, birth year, marriage status, weight in pounts,
 * and highest education level
 *
 * @author Monika Szucs
 * @author
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

    static LocalDate currentDate            = LocalDate.now();
    static int currentYear                  = currentDate.getYear();
    public static final int CURRENT_YEAR    = currentYear;

    public static final double POUNDS_TO_KILOGRAMS = 0.453592;
    public static final double KILOGRAMS_TO_POUNDS = 2.20462;

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
     * @IllegalArgumentException throws an illegal argument if the marriage or high school education level
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
     * The Person constructor that takes in five of the instance varaibles
     *
     * @param firstName
     * @param lastName
     * @param married
     * @param weightInPounds
     * @param highestEducationLevel
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

    Person(final String firstName, final String lastName, final double weightInPounds) {
        this.firstName              = firstName;
        this.lastName               = lastName;
        this.birthYear              = CURRENT_YEAR;
        this.married                = "no";
        this.weightInPounds         = weightInPounds;
        this.highestEducationLevel  = "high school";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return  birthYear;
    }

    public String isMarried() {
        if(married.equalsIgnoreCase("divorced")) {
            return "divorced";
        } else if(married.equalsIgnoreCase("yes")) {
            return "married";
        } else if(married.equalsIgnoreCase("no")){
            return "single";
        } else {
            return "not a valid married type";
        }
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public String getHighestEducationLevel() {
        if(highestEducationLevel.toLowerCase().equals("graduate"))
        {
            return "graduate degree!";
        } else if(highestEducationLevel.toLowerCase().equals("undergraduate"))
        {
            return "undergraduate degree!";
        } else if(highestEducationLevel.toLowerCase().equals("high school"))
        {
            return "high school diploma!";
        } else {
            return "invalid degree";
        }
    }

   private boolean isValidMarriageStatus(String marriedStatus) {
        if(     marriedStatus.equals("yes") ||
                marriedStatus.equals("no") ||
                marriedStatus.equals("divorced")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidEducationLevel(String educationLevelToVerify) {
        if(     educationLevelToVerify.equalsIgnoreCase("undergraduate") ||
                educationLevelToVerify.equalsIgnoreCase("graduate") ||
                educationLevelToVerify.equalsIgnoreCase("high school")) {
            return true;
        } else {
            return false;
        }
    }

    private void printDetails() {
            System.out.println(firstName + " " + lastName + " (" + isMarried() +") was born in " + birthYear + "," +
                    " weighs " + weightInPounds + " pounds, and has an " + getHighestEducationLevel());
    }

    private void printDetails(boolean kilograms) {
        if(kilograms) {
            double converted = POUNDS_TO_KILOGRAMS * weightInPounds;
                System.out.println(firstName + " " + lastName + " (" + isMarried() + ") was born in " + birthYear + "," +
                        " weighs " + String.format("%.1f", converted) + " kilograms, and has an " +
                        getHighestEducationLevel());
        }
        else {
                System.out.println(firstName + " " + lastName + " (" + isMarried() + ") was born in " + birthYear + "," +
                        " weighs " + getWeightInPounds() + " kilograms, and has an " +
                        getHighestEducationLevel());
        }
    }

    private void printDetails(boolean kilograms, boolean uppercase) {
        double converted = POUNDS_TO_KILOGRAMS * weightInPounds;
        if(uppercase && kilograms)
        {
                System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + " (" + isMarried() + ") was born in "
                        + birthYear + "," + " weighs " + String.format("%.1f", converted) + " kilograms, and has an " +
                        getHighestEducationLevel());

        } else if(!uppercase && kilograms)
        {
                System.out.println(firstName + " " + lastName + " (" + isMarried() + ") was born in " + birthYear + "," +
                        " weighs " + String.format("%.1f", converted) + " kilograms, and has an " +
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

    public static void main(final String[] args)
    {
        Person p1;
        p1 = new Person("Tiger", "Woods", 1975, "divorced", 200,
                "undergraduate");
        Person p2;
        p2 = new Person("Jason", "Harrison", 2000, "no", 180,
                "graduate");
        Person p3;
        p3 = new Person("Santa", "Claus", 1000, "yes",
                280, "high school");

        p1.printDetails();
        p1.printDetails(true);
        p1.printDetails(true, true);
        p1.printDetails(true, false);
        p1.printDetails(false, true);
        p1.printDetails(false, false);

        System.out.println("---");
        p2.printDetails();
        p2.printDetails(true);
        p2.printDetails(true,true);
        p2.printDetails(true, false);
        p2.printDetails(false, true);
        p2.printDetails(false, false);

        System.out.println("---");
        p3.printDetails();
        p3.printDetails(true);
        p3.printDetails(true,true);
        p3.printDetails(true, false);
        p3.printDetails(false, true);
        p3.printDetails(false, false);
    }
}
