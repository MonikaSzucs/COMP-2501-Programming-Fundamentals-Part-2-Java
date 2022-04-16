package ca.bcit.comp2501.lab1bHenry;

public class Student {
    private final String name;
    private String studentNumber;
    private final String date;
    private boolean graduated;

    public Student(Name name, String studentNumber, Date date, boolean graduated){
        this.name = name.getFullName();
        this.studentNumber = studentNumber;
        this.date = date.getYyMmDd();
        this.graduated = graduated;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public String getName(){
        return(name);
    }
    public String getStudentNumber(){
        return(studentNumber);
    }
    public String getDateOfBirth(){
        return(date);
    }
    public Boolean getGraduated(){
        return(graduated);
    }
    public String isGraduated(){
        if (graduated) return("graduated");
        else return("not graduated");
    }
}
