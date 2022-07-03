package ca.bcit.comp2501.lab1b.monikaszucsandhenryyoung;

/**
 * @Authors Monika Szucs and Henry Young
 * @version 1.0
 */
public class Student
{
    // Properties
    private Name    name;
    private Date    born;
    private String  studentNumber;
    private boolean graduated;

    /**
     * Constructors
     * @param name the name of the student
     * @param born the day the student was born
     * @param studentNumber the student number of the student
     * @param graduated determining if the student has graduated or not
     */
    public Student(final Name name, final Date born, final String studentNumber, final boolean graduated)
    {
        this.name = name;
        this.born = born;
        this.studentNumber = studentNumber;
        this.graduated = graduated;
    }

    /**
     * @param name the name of the student
     */
    public void setName(final Name name)
    {
        this.name = name;
    }

    /**
     * @return the name of the student
     */
    public Name getName()
    {
        return this.name;
    }

    /**
     * @param born the month, day and year the student was born
     */
    public void setDate(final Date born)
    {
        this.born = born;
    }

    /**
     * @return the date on which the student was born
     */
    public Date getDateOfBirth()
    {
        return born;
    }

    /**
     * @param studentNumber the student number of the student
     */
    public void setStudentNumber(final String studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    /**
     * @return the student number of the student
     */
    public String getStudentNumber()
    {
        return studentNumber;
    }

    /**
     * @param graduated determining if the student has graduated or not
     */
    public void setIsGraduated(final boolean graduated)
    {
        this.graduated = graduated;
    }

    /**
     * @return if the student has graduated or not
     */
    public String isGraduated()
    {
        if(graduated){
            return "graduated";
        }
        else{
            return "not graduated";
        }
    }
}
