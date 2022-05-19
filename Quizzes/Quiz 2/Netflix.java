public class Netflix {
    public final String[] movieTitles;

    public Netflix() {
        movieTitles = new String[2];

        movieTitles[0] = "Groundhog Day";
        movieTitles[1] = "Dead Poet's Society";

        if(movieTitles != null) {
            for(int i = 0; i < movieTitles.length; i++) {
                if(movieTitles[i] != null) {
                    System.out.println(movieTitles[i]);
                }
            }
        }
        // remove the first element in the array
        movieTitles[0] = null;

        //print how many movies are in the array
        System.out.println(movieTitles.length);

        // print the first movie title from the array
        System.out.println(movieTitles[0]);

    }

    public static void main(final String[] args) {
        new Netflix();
        System.out.println(args[0]);
    }
}
