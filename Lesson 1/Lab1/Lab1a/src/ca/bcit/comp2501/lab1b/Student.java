package ca.bcit.comp2501.lab1b;

public class Student {
    // Properties
    private Name name;
    private String studentNumber;
    private Date theDate;
    private Boolean isGraduated;

    // Constructor
    public Student(Name name, String studentNumber, Date theDate, Boolean isGraduated) {
        //this.setName(name);
        this.name = name;
        //this.setStudentNumber(studentNumber);
        this.studentNumber = studentNumber;
        this.theDate = theDate;
        //this.setDate(theDate);
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
    public void setDate(Date date) {
        this.theDate = theDate;
    }
    // Getter
    public Date getDate() {
        return this.theDate;
    }

    // Setter
    public void isGraduated(Boolean isGraduated) {
        //this.name = newName;
        this.isGraduated = isGraduated;
    }
    // Getter
    public String getGraduated() {
        System.out.println(this.isGraduated);

        if (this.isGraduated)
        {
            return "graduated";
        }
        else
        {
            return "not graduated";
        }
    }

    public String toString()
    {
        //Tiger Woods (T.W.) (st # A00123456) was born on 1975-12-30. The student has graduated.
        //and
        //Bill Gates (B.G.) (st # A00987654) was born on 1955-10-28. The student has not graduated.
        return name.getFullName() + " (" + name.getInitials() + ") (st # " + studentNumber + ") was born on " + theDate.getYyMmDd() + ". The student has " + getGraduated();
        //return name + name.getInitials() + studentNumber + getDate();
    }
}
