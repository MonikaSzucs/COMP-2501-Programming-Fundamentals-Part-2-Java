import java.util.Scanner;

public class Number {
    private final int minNum;
    private final int maxNum;

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;

    public Number(final int minNum, final int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    public void getNumber(final int minNum, final int maxNum) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        Integer guessing;
        Boolean proceed;
        proceed = true;

        do {
            System.out.println("Please guess one number");

            try {
                guessing = scanner.nextInt();
                if(guessing == null) {
                    System.out.println("Try again");
                    continue;
                } else if(guessing < MIN_NUMBER || guessing > MAX_NUMBER) {
                    System.out.println("out of bounds");
                }  else {
                    proceed = false;
                }
            } catch(Exception e) {
                System.out.println("Integer only");
                scanner.nextLine();
            }

        } while(proceed);

        scanner.close();

    }

    public static void main(final String[] args) {
        Number num;
        num = new Number(MIN_NUMBER, MAX_NUMBER);


        num.getNumber(MIN_NUMBER, MAX_NUMBER);


    }
}
