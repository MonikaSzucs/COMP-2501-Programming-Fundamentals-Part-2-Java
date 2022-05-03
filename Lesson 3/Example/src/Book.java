public class Book
{
    public static void main(final String[] args)
    {
        String s1 = new String("bcit");
        String s2 = new String("bcIT");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s1));
    }
}
