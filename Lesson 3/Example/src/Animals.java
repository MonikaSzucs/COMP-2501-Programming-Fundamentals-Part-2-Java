
public class Animals {

    public static void main(final String[] args)
    {
        String s1 = " Monika has had four birds, five fish, and now has a rabbit and guinea pig. ";
        String s2 = " She wants a dog someday ";
        String s3 = "";

        String s4 = "dog";
        String s5 = "Dog";


        System.out.println(s1.charAt(0));
        System.out.println(s1.length());
        System.out.println(s1.hashCode());
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains("birds"));
        System.out.println(s1.strip());
        System.out.println(s1.replace("a","o"));
        System.out.println(s1.strip().length());

        if(s3 != null || !s3.isBlank())
        {
            System.out.println("There is something here: " + s3);
        }
        else
        {
            System.out.println("empty");
        }

        if(s4.equalsIgnoreCase(s5))
        {
            System.out.printf("It matches the word: %s%n", s4);
        }
        else {
            System.out.println("Does not match");
        }

    }
}
