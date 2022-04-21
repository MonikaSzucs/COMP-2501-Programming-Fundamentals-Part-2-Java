package ca.bcit.comp2501.lab1b.MonikaSzucsandHenryYoung;

/**
 * @ Authors Monika Szucs and Henry Young
 */

public class Student
{
    // Properties
    private final Name  name;
    private Date        born;
    private String      studentNumber;
    private boolean     graduated;

    // Constructor
    public Student(final Name name, final Date born, final String studentNumber, final boolean isGraduated)
    {
        this.name = name;
        this.born = born;
        this.studentNumber = studentNumber;
        this.graduated = graduated;
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
    public void setDate(final Date born)
    {
        this.born = born;
    }

    /**
     *
     * @return the date on which the student was born
     */
    public Date getDateOfBirth()
    {
        return born;
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
    public void setIsGraduated(final boolean isGraduated)
    {
        this.graduated = graduated;
    }
    // Getter for Graduation
    public String getIsGraduated(){
        if(graduated){
            return "graduated";
        }
        else{
            return "not graduated";
        }

    }
}
