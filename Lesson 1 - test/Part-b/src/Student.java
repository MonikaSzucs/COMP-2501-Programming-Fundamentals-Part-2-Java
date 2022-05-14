class Student {
    public final Object name;
    public final Object birthDate;
    public final String studentNumber;
    public final boolean graduated;

    Student(final Object name, final Object birthDate, final String studentNumber, final boolean graduated) {
        this.name           = name;
        this.birthDate      = birthDate;
        this.studentNumber  = studentNumber;
        this.graduated      = graduated;
    }

    public Object getName() {
        return name;
    }

    public Object getDateOfBirth() {
        return birthDate;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String isGraduated() {
        if(graduated) {
            return "has graduated";
        } else {
            return "has not graduated";
        }
    }
}
