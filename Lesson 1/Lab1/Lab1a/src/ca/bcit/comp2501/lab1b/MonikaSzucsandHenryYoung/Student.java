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
    public Student(Name name, Date theDate, String studentNumber, Boolean isGraduated)
    {
        this.name = name;
        this.theDate = theDate;
        this.studentNumber = studentNumber;
        this.isGraduated = isGraduated;
    }

    // Setters
    public void setName(Name name)
    {
        this.name = name;
    }

    // Getter of Name
    public Name getName()
    {
        return this.name;
    }

    // Setter for Date
    public void setDate(Date theDate)
    {
        this.theDate = theDate;
    }

    // Getter of Date
    public Date theDate()
    {
        return theDate;
    }

    // Setter for Student Number
    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    // Getter for Student Number
    public String getStudentNumber()
    {
        return studentNumber;
    }

    // Setter for Graduation
    public void setIsGraduated(Boolean isGraduated)
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
