public class StarWarsName {

    public StarWarsName()
    {

    }



    public static void main(final String[] args)
    {
        String starWarsName = "Brady|Mills|Shepherd|Chilliwack";

        String[] arrOfStr = starWarsName.split("\\|", 4);

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
