import java.util.ArrayList;

class MovieTheatre {
    private String movieTitle;
    private final ArrayList<String> movieTheatres;

    MovieTheatre()
    {
        movieTheatres = new ArrayList<>();

        movieTheatres.add("Groundhog Day");
        movieTheatres.add("Dead Poet's Society");

        System.out.println("--Print Size of ArrayList--");
        System.out.println("The Size of the ArrayList is " + movieTheatres.size());

        //Printing all
        System.out.println("--Print All--");
        for(String movie: movieTheatres)
        {
            if(movie != null)
            {
                System.out.println(movie);
            }
        }

        System.out.println("--Print only first item in ArrayList--");
        System.out.println(movieTheatres.get(0));

        System.out.println("--Print the longest movie title--");
        String longestMovie = "";
        for(String movie: movieTheatres)
        {
            if(movie != null)
            {
                if(movie.length() > longestMovie.length())
                {
                    longestMovie = movie;
                }
            }
        }
        System.out.println(longestMovie);

        System.out.println("--Remove first element in ArrayList--");
        movieTheatres.remove(0);
        for(String movie: movieTheatres)
        {
            if(movie != null)
            {
                System.out.println(movie);
            }
        }

        System.out.println("--Print Size of ArrayList--");
        System.out.println("The Size of the ArrayList is " + movieTheatres.size());

        System.out.println("--Print only first item in ArrayList--");
        System.out.println(movieTheatres.get(0));

    }

    public static void main(final String[] args)
    {
        MovieTheatre movies;
        movies = new MovieTheatre();
    }
}
