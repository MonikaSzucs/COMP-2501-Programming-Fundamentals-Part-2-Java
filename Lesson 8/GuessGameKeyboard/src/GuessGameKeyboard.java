import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class GuessGameKeyboard {
    public static final int FIVE_NUMBER_BOUND = 5;
    public static final int PLUS_ONE = 1;
    public static final int USER_GUESS_GREATER_THAN_FIVE = 5;
    public static final int USER_GUESS_LESS_THAN_ONE = 1;

    public static void main(final String[] args) {
        Random random;
        random = new Random();

        int randomInt = 0;
        int userGuess = 0;

        Scanner scanner;
        scanner = new Scanner(System.in);
        String userInput = null;
        boolean keepPlaying = true;

        while(keepPlaying) {
            randomInt = random.nextInt(FIVE_NUMBER_BOUND) + PLUS_ONE; // 0 - 4 become 1 - 5

            System.out.println("Type 1 to 5 or EXIT: ");
            if(scanner.hasNext()) {
                if(scanner.hasNextInt()) {
                    userGuess = scanner.nextInt();
                    if(userGuess > USER_GUESS_GREATER_THAN_FIVE || userGuess < USER_GUESS_LESS_THAN_ONE) {
                        System.out.println("Error " + userGuess + " is out of bounds");
                    } else if(userGuess == randomInt) {
                        System.out.println("Correct! you typed: " + userGuess + " and the computer chose " + randomInt);
                    } else {
                        System.out.println("Wrong! you typed: " + userGuess + " but the computer chose " + randomInt);
                    }
                } else {
                    userInput = scanner.next();
                    if(userInput.equalsIgnoreCase("exit")) {
                        System.out.println("Bye");
                        keepPlaying = false;
                        scanner.close();
                    } else {
                        System.out.println("Invalid string " + userInput);
                    }
                }
            }
        }

    }
}
