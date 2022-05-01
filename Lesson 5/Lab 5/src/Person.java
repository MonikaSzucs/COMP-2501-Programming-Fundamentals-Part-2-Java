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

    Person(final String firstName, final String lastName, final int birthYear, final String married, final double weightInPounds, final String highestEducationLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.married = married;
        this.weightInPounds = weightInPounds;
        this.highestEducationLevel = highestEducationLevel;
    }

    Person(final String firstName, final String lastName, final String married, final double weightInPounds, final String highestEducationLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = CURRENT_YEAR;
        this.married = married;
        this.weightInPounds = weightInPounds;
        this.highestEducationLevel = highestEducationLevel;
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

    private boolean isValidEducationLevel(String educationLevelToVerify)
    {
        if(educationLevelToVerify.equals("high school"))
        {
            return true;
        }
        else if(educationLevelToVerify.equals("undergraduate"))
        {
            return true;
        }
        else if(educationLevelToVerify.equals("graduate"))
        {
            return true;
        }
        else
        {
            return true;
        }
    }

    private String isValidMarriageStatus(String marriedStatus)
    {
        if(marriedStatus.equals("yes"))
        {
            return "yes";
        }
        else if(marriedStatus.equals("no"))
        {
            return "no";
        }
        else if(marriedStatus.equals("divorced"))
        {
            return "divorced";
        }
        else
        {
            return "NA";
        }

    }

    private void printDetails() {

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
