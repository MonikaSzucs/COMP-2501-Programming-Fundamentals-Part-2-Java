public class Amazon {

    public String getFullName(final String first, final String last) {
        // local variable is fullName and can only be used by this method not by other methods
        String fullName;
        fullName = first + " " + last;
        return fullName;
    }

    public static void main(final String[] args) {
        String s1;
        s1 = "hi";
        System.out.println(Integer.toHexString(s1.hashCode()));
        s1 = "bye";
        System.out.println(Integer.toHexString(s1.hashCode()));
        s1 = "hi";
        System.out.println(Integer.toHexString(s1.hashCode()));
    }
}
