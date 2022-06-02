//(a) Provide the code that will tell us if the first String comes before the second String alphabetically, and
// (b) state whether the result of that comparison is positive, negative, or zero value.

//        String first = "A";
//        String second = "a";

public class StringComparisonPositiveNegativeZero {

    public static void main(final String[] args) {
        String first = "A";
        String second = "a";

        if(first.compareTo(second) < 0) {
            System.out.println("The first String has s smaller value than the Second String. " +
                    "This mean the Second String comes first in Alphabetical order. " +
                    "The result was negative.");
        } else if(first.compareTo(second) > 0) {
            System.out.println("The first String has a larger value than the second String." +
                    "This means the first String comes first in Alphabetical order." +
                    "The result was positive");
        } else if(first.compareTo(second) == 0) {
            System.out.println("The result has a zero value which means that they are equal.");
        }
    }
}
