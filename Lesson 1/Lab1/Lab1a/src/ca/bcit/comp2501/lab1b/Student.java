package ca.bcit.comp2501.lab1b;

public class Student {
    // Properties
    final String name;
    final String studentNumber;
    final String dateOfBirth;
    Boolean graduated;

    public Student(String name, String studentNumber, String dateOfBirth, Boolean graduated) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.dateOfBirth = dateOfBirth;
        this.graduated = graduated;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Getter
    public String getStudentNumber() {
        return name;
    }

    // Getter
    public String getDateOfBirth() {
        return name;
    }

    // Setter
    public void isGraduated(Boolean graduated) {
        //this.name = newName;
        this.graduated = graduated;
    }
}
