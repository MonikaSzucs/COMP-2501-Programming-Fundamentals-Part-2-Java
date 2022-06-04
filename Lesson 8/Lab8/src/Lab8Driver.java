import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab8Driver {
    Map<String, Student> students;


    Lab8Driver(){
        students = new HashMap<>();
    }

    public void readFromPrompt()
    {
        System.out.println("DEBUG: calling readFromPrompt");

        Scanner scanner;
        scanner = new Scanner(System.in);
        String choice;
        boolean proceed = true;

        String firstName;
        String lastName;
        String idNumber;
        int ageYears;
        double gradePct;

        do {
            System.out.println("Do you with to create a Student? (y/n): ");
            choice = scanner.next().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("yes");
                firstName = scanner.next().toLowerCase();
                lastName = scanner.next().toLowerCase();
                idNumber = scanner.next().toLowerCase();
                ageYears = scanner.nextInt();
                gradePct = scanner.nextDouble();

                Student student1 = new Student(firstName, lastName,
                        idNumber, ageYears, gradePct);
                students.put(idNumber, student1);

            } else if(choice.equals("n")) {
                proceed = false;
            }
        } while (proceed);

        scanner.close();
        System.out.println("End 1");
    }

    public void readFromFile() throws FileNotFoundException
    {
        System.out.println("List of Students created");

        File myFile;
        myFile = new File("student_data.txt");
        Scanner scanner;
        scanner = new Scanner(myFile);
        String savedLine = null;
        boolean keepReading = true;

        String[] arrayValues;
        String firstName;
        String lastName;
        String idNumber;
        int ageYears;
        double gradePct;

        while(keepReading) {
            if(scanner.hasNext()) {
                savedLine = scanner.next();

                arrayValues = savedLine.split(",");
                firstName = String.valueOf(arrayValues[0]);
                lastName = String.valueOf(arrayValues[1]);
                idNumber = String.valueOf(arrayValues[2]);
                ageYears = Integer.valueOf(arrayValues[3]);
                gradePct = Double.valueOf(arrayValues[4]);

                if(savedLine != null || !savedLine.isEmpty()) {
                    //Student [firstName=Pike, lastName=Bass, idNumber=A00953177, ageYears=22, gradePct=81.5,pass=true]
                    //System.out.println("Student [firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" +
                    //        idNumber + ", ageYears=" + ageYears + ", gradePct=" + gradePct + ", pass=" + pass + "]");
                    Student student1 = new Student(firstName, lastName,
                            idNumber, ageYears, gradePct);
                    students.put(idNumber, student1);
                }
            } else {
                keepReading = false;
            }
        }
        scanner.close();
        System.out.println("End2");
    }

    public void showStudents() {
        System.out.println("----");
        Set<String> keys = students.keySet();
        for(String key: keys) {
            Student student = students.get(key);
            System.out.println("Student [firstName=" + student.getFirstName() +
                    ", lastName=" + student.getLastName() +
                    ", idNumber=" + student.getIdNumber() +
                    ", ageYears=" + student.getBirthYear() +
                    ", gradePct=" + student.getPercentageGrade() +
                    ", pass=" + student.setPass() + "]");
        }
    }

    public static void main(final String[] args) throws FileNotFoundException {
        Lab8Driver b;
        b = new Lab8Driver();

        b.readFromPrompt();
        b.readFromFile();
        System.out.println("TEST");
        b.showStudents();
    }
}
