import java.time.LocalDate;
import java.time.Year;

public class Student {
    private String      firstName;
    private String      lastName;
    private String      idNumber;
    private int         birthYear;
    private double      percentageGrade;
    private boolean     pass;

    LocalDate now = LocalDate.now();

    public Student(final String firstName, final String lastName, final String idNumber, final int birthYear, final double percentageGrade)
    {
        if(firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("The first name cannot be null/empty");
        }
        if(lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("The last name cannot be null/empty");
        }
        if(idNumber == null || idNumber.isEmpty()) {
            throw new IllegalArgumentException("The ID number cannot be null/empty");
        }
        if(birthYear > now.getYear()) {
            throw new IllegalArgumentException("You cannot have the birth year larger than the current year");
        }
        if(percentageGrade > 100 || percentageGrade < 0) {
            throw new IllegalArgumentException("The percentage cannot be larger than 100 or less than 0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = now.getYear() - birthYear;
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
        if(birthYear <= now.getYear()) {
            return (now.getYear() - birthYear);
        } else {
            throw new IllegalArgumentException("You cannot have the birth year larger than the current year");
        }
    }

    public double getPercentageGrade() {
        return percentageGrade;
    }

    public Boolean setPass() {
        return pass;
    }

    public String toString() {
        return "Student [firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", idNumber=" + getIdNumber() +
                ", ageYears=" + birthYear +
                ", gradePct=" + getPercentageGrade() +
                ", pass=" + setPass() + "]";
    }
}
