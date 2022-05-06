import java.time.LocalDate;

class Person {
    private final String firstName;
    private final String lastName;
    private final int birthYear;
    private final String married;
    private final double weightInPounds;
    private final String highestEducationLevel;

    static LocalDate currentDate = LocalDate.now();
    static int currentYear = currentDate.getYear();
    public static final int CURRENT_YEAR = currentYear;

    public static final double POUNDS_TO_KILOGRAMS = 0.453592;
    public static final double KILOGRAMS_TO_POUNDS = 2.20462;

    Person(final String firstName, final String lastName, final int birthYear, final String married, final double weightInPounds, final String highestEducationLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;

        if(!isValidMarriageStatus(married)) {
            throw new IllegalArgumentException("Must have a married status of yes, no, or divorced");
        }
        this.married = married;
        this.weightInPounds = weightInPounds;

        if(isValidEducationLevel(highestEducationLevel)) {
            this.highestEducationLevel = highestEducationLevel;
        } else{
            throw new IllegalArgumentException("Must be high school, undergraduate, or graduate level of education");
        }
    }

    Person(final String firstName, final String lastName, final String married, final double weightInPounds, final String highestEducationLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = CURRENT_YEAR;

        if(!isValidMarriageStatus(married)) {
            throw new IllegalArgumentException("Must have a married status of yes, no, or divorced");
        }
        this.married = married;
        this.weightInPounds = weightInPounds;

        if(isValidEducationLevel(highestEducationLevel)) {
            this.highestEducationLevel = highestEducationLevel;
        } else{
            throw new IllegalArgumentException("Must be high school, undergraduate, or graduate level of education");
        }
    }

    Person(final String firstName, final String lastName, final double weightInPounds)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = CURRENT_YEAR;
        this.married = "no";
        this.weightInPounds = weightInPounds;
        this.highestEducationLevel = "high school";
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getBirthYear()
    {
        return  birthYear;
    }

    public String isMarried()
    {
        return married;
    }

    public double getWeightInPounds()
    {
        return weightInPounds;
    }

    public String getHighestEducationLevel()
    {
        return highestEducationLevel;
    }

   private boolean isValidMarriageStatus(String marriedStatus)
    {
        if(marriedStatus.equals("yes") ||
                marriedStatus.equals("no") ||
                marriedStatus.equals("divorced")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidEducationLevel(String educationLevelToVerify)
    {
        return true;
    }

    private void printDetails() {
        //Tiger Woods (divorced) was born in 1975, weighs 200.0 pounds, and has an undergraduate degree!
        System.out.println(firstName + " " + lastName + " (" + isMarried() + ") was born in " + birthYear + "," +
                " weighs " + weightInPounds + ", and has an " + getHighestEducationLevel());
    }

    private void printDetails(boolean kilograms) {

    }

    private void printDetails(boolean kilograms, boolean uppercase) {

    }

    public static void main(final String[] args)
    {
        Person p1 = new Person("Tiger", "Woods", 1975, "divorced", 200,
                "undergraduate");
        p1.printDetails();
        p1.printDetails(true);
        p1.printDetails(true, true);
        p1.printDetails(true, false);
        p1.printDetails(false, true);
        p1.printDetails(false, false);
    }


}
