import java.util.Scanner;

public class DemoDriver {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        System.out.println(scanner.nextInt());

        System.out.println("Enter a decimal number: ");
        System.out.println(scanner.nextDouble());

        System.out.println("Are you happy? (enter true or false)");
        System.out.println(scanner.nextBoolean());

        System.out.println("Enter a your first name: ");
        System.out.println(scanner.next());
    }
}
