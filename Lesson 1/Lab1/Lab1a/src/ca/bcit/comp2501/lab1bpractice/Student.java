package ca.bcit.comp2501.lab1bpractice;

public class Student {
    private Name name;
    private Date born;
    private String studentNumber;
    private boolean graduated;

    public Student(final Name name, final Date born, final String studentNumber, final boolean graduated)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.born = born;
        this.graduated = graduated;
    }

    public void setName(final Name name)
    {
        this.name = name;
    }

    public Name getName()
    {
        return name;
    }

    public void setStudentNumber(final String studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public void setBorn(Date born)
    {
        this.born = born;
    }

    public Date getDateOfBirth()
    {
        return born;
    }

    public void setIsGraduated(boolean graduated)
    {
        this.graduated = graduated;
    }

    public String isGraduated()
    {
        if(graduated)
        {
            return "has graduated";
        }
        else
        {
            return "has not graduated";
        }
    }
}
