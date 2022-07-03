public class ArgsPosition
{
    // go to run > edit configurations
    // Then in program configurations you can type a bc def - without quotes
    public static void main(final String[] args)
    {
        String s1 = "hello";
        System.out.println(Integer.toHexString(s1.hashCode()));

        s1 = "world";
        System.out.println(Integer.toHexString(s1.hashCode()));

        if(args.length != 1)
        {
            System.out.println("ERROR!");
        }
        else
        {
            System.out.println("The author is " + args[0]);
        }
    }
}
