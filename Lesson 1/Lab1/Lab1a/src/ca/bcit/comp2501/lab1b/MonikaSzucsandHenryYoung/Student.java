package ca.bcit.comp2501.lab1b.MonikaSzucsandHenryYoung;

/**
 * @ Authors Monika Szucs and Henry Young
 */

public class Student {
    // Properties
    private Name name;
    private Date theDate;
    private String studentNumber;
    private Boolean isGraduated;

    // Constructor
    public Student(final Name name, final Date theDate, final String studentNumber, final Boolean isGraduated)
    {
        this.name = name;
        this.theDate = theDate;
        this.studentNumber = studentNumber;
        this.isGraduated = isGraduated;
    }

    // Setters
    public void setName(final Name name)
    {
        this.name = name;
    }

    // Getter of Name
    public Name getName()
    {
        return this.name;
    }

    // Setter for Date
    public void setDate(final Date theDate)
    {
        this.theDate = theDate;
    }

    // Getter of Date
    public Date theDate()
    {
        return theDate;
    }

    // Setter for Student Number
    public void setStudentNumber(final String studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    // Getter for Student Number
    public String getStudentNumber()
    {
        return studentNumber;
    }

    // Setter for Graduation
    public void setIsGraduated(final Boolean isGraduated)
    {
        this.isGraduated = isGraduated;
    }
    // Getter for Graduation
    public String getIsGraduated(){
        if(isGraduated){
            return "graduated";
        }
        else{
            return "not graduated";
        }

    }
}
