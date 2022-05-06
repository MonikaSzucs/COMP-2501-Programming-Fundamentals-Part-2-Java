public class StarWarsName {
    private String starWarsName;

    public StarWarsName(final String starWarsName)
    {
        this.starWarsName = starWarsName;
    }

    public void setStarWarsName(String starWarsName)
    {
        this.starWarsName = starWarsName;
    }

    public void getStarWarsName()
    {
        String[] arrOfStr = starWarsName.split("\\|", 4);
        String newFirstName = "";
        String newLastName = "";
        int number = 1;
        for (String a : arrOfStr) {
            if(number == 1)
            {
                newFirstName += a.substring(0,3);
                number++;
            } else if(number == 2)
            {
                newFirstName += a.substring(0,2).toLowerCase();
                number++;
            }
            else if(number == 3)
            {
                newLastName += a.substring(0,2);
                number++;
            }
            else if(number == 4)
            {
                newLastName += a.substring(0,3).toLowerCase();
            }
        }
        System.out.format(newFirstName + " " + newLastName);
    }

    public static void main(final String[] args)
    {
        StarWarsName starWarsName = new StarWarsName("Brady|Mills|Shepherd|Chilliwack");
        starWarsName.getStarWarsName();
    }
}
