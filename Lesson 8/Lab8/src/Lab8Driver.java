import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab8Driver {
    Map<String, Student> students;

    Lab8Driver(){
        students = new HashMap<>();
    }

    public void readFromPrompt()
    {
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
            System.out.println("Do you wish to create a Student? (y/n): ");
            choice = scanner.next().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("yes");
                System.out.println("Enter first name:");
                firstName = scanner.next().toLowerCase();

                System.out.println("Enter last name:");
                lastName = scanner.next().toLowerCase();

                System.out.println("Enter id number:");
                idNumber = scanner.next().toUpperCase();

                System.out.println("Enter birth year as a whole number:");
                ageYears = scanner.nextInt();

                System.out.println("Enter grade (percentage) as a decimal number:");
                gradePct = scanner.nextDouble();

                firstName = firstName.toUpperCase().charAt(0) + firstName.toLowerCase().substring(1);
                lastName = lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1);

                Student student1 = new Student(firstName, lastName,
                        idNumber, ageYears, gradePct);
                students.put(idNumber, student1);
            } else if(choice.equals("n")) {
                proceed = false;
                System.out.println("Data entry finished!");
            }
        } while (proceed);
        scanner.close();
    }

    public void readFromFile() throws FileNotFoundException
    {
        System.out.println();
        System.out.println("DEBUG: calling readFromFile");
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
                    Student student1 = new Student(firstName, lastName,
                            idNumber, ageYears, gradePct);
                    students.put(idNumber, student1);
                }
            } else {
                keepReading = false;
            }
        }
        scanner.close();
    }

    public void showStudents() {
        Set<String> keys = students.keySet();
        for(String key: keys) {
            Student student = students.get(key);
            System.out.println(student.toString());
        }
    }

    public static void main(final String[] args) throws FileNotFoundException {
        Lab8Driver b;
        b = new Lab8Driver();

        b.readFromPrompt();
        b.readFromFile();
        b.showStudents();
    }
}
