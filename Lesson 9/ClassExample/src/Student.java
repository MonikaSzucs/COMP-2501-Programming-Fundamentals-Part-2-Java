class Student extends Mammal {
    private final String studentNumber;
    Student(final String studentId) {
        super(77.0);
        studentNumber = studentId;
    }
}

class BcitStudent extends Student {
    BcitStudent(final String stNum) {
        super(stNum);
        if(stNum.length() != 9) {
            throw new IllegalArgumentException();
        }
    }
}

