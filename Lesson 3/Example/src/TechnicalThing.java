public class TechnicalThing {
    public static void main(final String[] args)
    {
        String s1 = "hello";
        System.out.println(Integer.toHexString(s1.hashCode()));

        String s1 = "world";
        System.out.println(Integer.toHexString(s1.hashCode()));

        for(String s: args)
        {
            System.out.println(s);
        }
    }
}
