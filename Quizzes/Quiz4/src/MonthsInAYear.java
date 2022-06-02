//Declare and set a symbolic constant that represents the number of months in a year.

public class MonthsInAYear {

    public static final int MONTHS_IN_A_YEAR = 12;

    public static void main(final String[] args) {
        StringBuilder sentence;
        sentence = new StringBuilder();

        sentence.append("We have ");
        sentence.append(MONTHS_IN_A_YEAR);
        sentence.append(" months in a year.");

        System.out.println(sentence);
    }
}
