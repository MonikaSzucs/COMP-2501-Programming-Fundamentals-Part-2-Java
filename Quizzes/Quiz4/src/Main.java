public class Main {
    public static void main(final String[] args) {
        String s = "Beatles";
        System.out.println(Integer.toHexString(s.hashCode()));
        s = "Stones";
        System.out.println(Integer.toHexString(s.hashCode()));
    }
}
