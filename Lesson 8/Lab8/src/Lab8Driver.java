import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab8Driver {
    Map<String, String> students;

    Lab8Driver(){
        students = new HashMap<String,String>();
    }

    public void readFromPrompt()
    {
        boolean proceed = true;
        do {
            System.out.println("Do you with to create a Student? (y/n: ");
            String choice = scanner.next().toLowerCase();
            if (choice.equals("y")) {
                // here prompt for data
            } else {
                proceed = false;
            }
        } while (proceed);
    }

    public void readFromFile()
    {

    }

    public void showStudents()
    {

    }

    public static void main(final String[] args)
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
    }
}
