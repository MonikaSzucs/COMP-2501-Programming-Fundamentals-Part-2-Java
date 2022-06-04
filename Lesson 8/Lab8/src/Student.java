import java.util.Set;

public class Student {
    private String      firstName;
    private String      lastName;
    private String      idNumber;
    private int         birthYear;
    private double      percentageGrade;
    private boolean     pass;


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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getPercentageGrade() {
        return percentageGrade;
    }

    public Boolean setPass() {
        return pass;
    }
}
