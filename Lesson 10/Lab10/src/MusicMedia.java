/**
 * MusicMedia.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #10
 *
 * Exploring polymorphism by developing a Music Media Library
 *
 * @author Monika Szucs
 * @author Yao Linkun
 *
 * @version 1.2
 *
 * This is a driver class that will ask the user for their input and create the objects.
 *
 */
class MusicMedia {
    private final String    musicalArtist;
    private final String    songTitle;
    private final int       totalNumberOfSongs;
    private final int       totalRuntime;
    private final int       yearReleased;

    private static final int MIN_YEAR = 1700;
    private static final int MIN_NUMBER_OF_SONGS = 0;
    private static final int MIN_RUNTIME = 0;

    /**
     * This is the MusicMedia constructor
     *
     * @param musicalArtist this is the musical artists name
     * @param songTitle this is the title of the song
     * @param yearReleased this is when the song was released
     * @param totalNumberOfSongs this is the total number of songs in the music media
     * @param totalRuntime this is the total runtime
     */
    MusicMedia(
            final String musicalArtist,
            final String songTitle,
            final int yearReleased,
            final int totalNumberOfSongs,
            final int totalRuntime
    ) {
        if(musicalArtist == null || musicalArtist.isEmpty()) {
            throw new IllegalArgumentException("You must enter in a musical artist name");
        }

        if(songTitle == null || songTitle.isEmpty()) {
            throw new IllegalArgumentException("You must have a song title");
        }

        if(totalNumberOfSongs<= MIN_NUMBER_OF_SONGS) {
            throw new IllegalArgumentException("You cannot have zero or negative songs");
        }

        if(totalRuntime <= MIN_RUNTIME) {
            throw new IllegalArgumentException("The runtime cannot be 0 or less");
        }

        if(yearReleased < MIN_YEAR) {
            throw new IllegalArgumentException("Min year cannot be less than " + yearReleased);
        }

        this.musicalArtist = musicalArtist;
        this.songTitle = songTitle;
        this.totalNumberOfSongs = totalNumberOfSongs;
        this.totalRuntime = totalRuntime;
        this.yearReleased = yearReleased;
    }

    /**
     * This is the getter for the musical artist
     *
     * @return this will return the musical artist name
     */
    public String getMusicalArtist() {
        return musicalArtist;
    }

    /**
     * This is the getter for the song title
     *
     * @return this will return the song title
     */
    public String getSongTitle() {
        return  songTitle;
    }

    /**
     * This is the getter for the total number of songs
     *
     * @return this will return the total number of songs
     */
    public int getTotalNumberOfSongs() {
        return totalNumberOfSongs;
    }

    /**
     * This is the getter for the year released
     *
     * @return this will return when the song was released
     */
    public int getYearReleased() {
        return yearReleased;
    }

    /**
     * This is the getter for the total runtime
     *
     * @return this will return the total runtime in minutes
     */
    public int getTotalRuntime() {
        return  totalRuntime;
    }

    /**
     * This is the playSelection for the MusicMedia
     */
    public void playSelection() {
        System.out.println("Thank you for using our Music Library \n" +
                "You selected the record: " + songTitle + " by " + musicalArtist + "\n" +
                "This is a Music Media that has " + totalNumberOfSongs + " with a runtime of " + totalRuntime +
                "\n\n"
        );
    }

    /**
     * This is the toString method for the MusicMedia
     *
     * @return this will return a toString layout of all the information of the songs
     */
    @Override
    public String toString() {
        return "MusicMedia{" +
                "musicalArtist='" + musicalArtist + '\'' +
                ", songTitle='" + songTitle + '\'' +
                ", yearReleased=" + yearReleased +
                ", totalNumberOfSongs=" + totalNumberOfSongs +
                ", totalRuntime=" + totalRuntime +
                '}';
    }
}
