package ca.bcit.comp2501.lab1b.MonikaSzucsHenryYoung;

/**
 * @ author Monika Szucs and Henry Young
 */

public class Student {
    // Properties
    private Name name;
    private Date theDate;
    private String studentNumber;
    private Boolean isGraduated;

    // Constructor
    public Student(Name name, Date theDate, String studentNumber,  Boolean isGraduated) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.theDate = theDate;
        this.isGraduated = isGraduated;
    }

    // Setter for the Name
    public void setName(Name name) {
        this.name = name;
    }

    // Getter for the Name
    public Name getName() {
        return this.name;
    }

    // Setter for the Student Number
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    // Getter for the Student Number
    public String getStudentNumber() {
        return this.studentNumber;
    }

    // Setter for the Date
    public void setDate(Date theDate) {
        this.theDate = theDate;
    }

    // Getter for the Date
    public Date getDate() {
        return this.theDate;
    }

    // Setter for Graduated
    public void isGraduated(Boolean isGraduated) {
        this.isGraduated = isGraduated;
    }

    // Getter for Graduated
    public String getGraduated() {
        //System.out.println(this.isGraduated);
        if (this.isGraduated)
        {
            return "graduated";
        }
        else
        {
            return "not graduated";
        }
    }
}
