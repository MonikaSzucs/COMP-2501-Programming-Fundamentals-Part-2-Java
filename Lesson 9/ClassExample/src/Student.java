class Student {
    private final String studentNumber;
    Student(final String studentId) {
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

