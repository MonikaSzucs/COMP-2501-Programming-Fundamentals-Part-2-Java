import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 10;
        int result = r.nextInt(high-low) + low;
        System.out.println(result);

        boolean checking = true;
        boolean proceed = true;

        int  choice;
        Scanner scanner;

        do {
            scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int item = Integer.parseInt(scanner.next());
                if(item > 10 || item < 1) {
                    System.out.println("That is not 1-10");
                }
                else {
                    System.out.println("Yes!");
                    break;
                }
            } else {
                System.out.println("That is not an int");
            }
        } while(checking);
        
        scanner.close();
    }
}
