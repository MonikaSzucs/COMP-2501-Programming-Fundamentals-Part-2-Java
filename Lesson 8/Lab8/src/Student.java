public class Student {
    private final String    firstName;
    private final String    lastName;
    private final String    idNumber;
    private final int       birthYear;
    private final double    percentageGrade;
    private final boolean   pass;

    public Student(final String firstName, final String lastName, final String idNumber, final int birthYear, final double percentageGrade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.percentageGrade = percentageGrade;

        if(percentageGrade >= 60) {
            pass = true;
        }
        else {
            pass = false;
        }
    }

    public static void main(final String[] args)
    {

    }
}
