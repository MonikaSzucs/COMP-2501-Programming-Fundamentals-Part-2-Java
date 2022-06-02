//Create a program that takes a sentence as a Program Argument (String[] args) and generates the following output. You may do this all in the driver class.
//        If the program is run without providing a Program Argument then display a message.

//        sentence entered: "Mares eat oats and does eat oats and little lambs eat ivy."

//        output:
//        This is the sentence you entered: Mares eat oats and does eat oats and little lambs eat ivy.
//      This is your sentence in upper case: MARES EAT OATS AND DOES EAT OATS AND LITTLE LAMBS EAT IVY.
//        This is each word of the sentence displayed on separate lines
//        Mares
//        eat
//        oats
//        and
//        does
//        eat
//        oats
//        and
//        little
//        lambs
//        eat
//        ivy.
//        This is the sentence displayed with each character separated by a comma:
//        M,a,r,e,s, ,e,a,t, ,o,a,t,s, ,a,n,d, ,d,o,e,s, ,e,a,t, ,o,a,t,s, ,a,n,d, ,l,i,t,t,l,e, ,l,a,m,b,s, ,e,a,t, ,i,v,y,.,
//        This is the sentence by word in reverse order:
//        ivy. eat lambs little and oats eat does and oats eat Mares

import java.util.Locale;

public class ProgramArgument {
    private static String stringSentence;

    /**
     * This is the Constructor that takes in the program argument
     * @param stringSentence this is the sentence from the argument that was passed in String value.
     */
    public ProgramArgument(final String stringSentence) {
        this.stringSentence = stringSentence;
    }

    /**
     * This is the getter that makes the argument uppercase
     */
    public static void getUpperCaseSentence() {
        System.out.println(stringSentence.toUpperCase());
    }

    /**
     * This is the getter that puts each word on separate lines
     */
    public static void getSeparateLines() {
        String[] arrayName;

        arrayName = stringSentence.split(" ");
        for(int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i]);
        }
    }

    /**
     * This is the getter that separates each letter by commas
     */
    public static void getSeparatedByComma() {
        System.out.println(stringSentence.length());
        StringBuilder newString;
        newString = new StringBuilder();

        for(int j = 0; j < stringSentence.length(); j++) {
            newString.append(stringSentence.substring(j, j+1) + ",");
        }
        System.out.println(newString);
    }

    /**
     * This is the getter that puts the words in the sentence in reverse order.
     */
    public static void getWordReverseOrder() {
        String[] words = stringSentence.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        System.out.println(reverseString);
    }

    /**
     * This is the main
     * @param args This main takes in the arguments that were passed.
     */
    public static void main(final String[] args) {
        ProgramArgument sentence;
        sentence = new ProgramArgument(args[0]);

        getUpperCaseSentence();
        getSeparateLines();
        getSeparatedByComma();
        getWordReverseOrder();
    }
}
