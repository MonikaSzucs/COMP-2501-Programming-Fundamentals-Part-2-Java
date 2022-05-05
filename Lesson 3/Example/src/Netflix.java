import java.util.ArrayList;

class Netflix {
    private final ArrayList<String> movieTitles;

    Netflix()
    {
        movieTitles = new ArrayList<>();

        movieTitles.add("Groundhog Day");
        movieTitles.add("Dead Poet's Society");

        System.out.println("-- Print out all of the items in the ArrayList --");
        if(movieTitles != null)
        {
            for(int i=0; i < movieTitles.toArray().length; i++)
            {
                if(movieTitles.get(i) != null)
                {
                    System.out.println(movieTitles.get(i));
                }
            }
        }

        System.out.println("-- Removed the first movie and set to null --");
        movieTitles.set(0, null);

        System.out.println("-- print the first movie title in the array --");
        int num = 0;
        if(movieTitles != null)
        {
            for(int i=0; i < movieTitles.toArray().length; i++)
            {
                if(movieTitles.get(i) != null)
                {
                    System.out.println(movieTitles.get(i));
                    num++;
                }
            }
        }

        System.out.println("-- Print number of movies in the array --");
        System.out.println(num);
    }

    public static void main(final String[] args)
    {
        Netflix movies;
        movies = new Netflix();
    }
}
