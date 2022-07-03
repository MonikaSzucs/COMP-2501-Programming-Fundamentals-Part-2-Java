public class StringStuff {
    public static void main(final String[] args) {
        String s1;
        String s2;
        s1 = "hello";
        s2 = "world";
        if(s1.compareTo(s2) > 0) {
            System.out.println("s1 is bigger");
        } else {
            System.out.println("s1 is NOT bigger");
        }
    }
}
