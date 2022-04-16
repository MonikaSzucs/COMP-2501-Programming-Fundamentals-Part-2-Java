package ca.bcit.comp2501.lab1b;

/**
 * @ author Monika Szucs and Henry Young
 */

public class Student {
    // Properties
    private Name name;
    private String studentNumber;
    private Date theDate;
    private Boolean isGraduated;

    // Constructor
    public Student(Name name, String studentNumber, Date theDate, Boolean isGraduated) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.theDate = theDate;
        this.isGraduated = isGraduated;
    }

    // Setter
    public void setName(Name name) {
        this.name = name;
    }

    // Getter
    public Name getName() {
        return this.name;
    }

    // Setter
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    // Getter
    public String getStudentNumber() {
        return this.studentNumber;
    }

    // Setter
    public void setDate(Date theDate) {
        this.theDate = theDate;
    }

    // Getter
    public Date getDate() {
        return this.theDate;
    }

    // Setter
    public void isGraduated(Boolean isGraduated) {
        this.isGraduated = isGraduated;
    }
    // Getter
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
