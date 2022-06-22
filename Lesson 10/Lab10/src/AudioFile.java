/**
 * AudioFile.java
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
 * This is a audio file class that will check the audio file created
 *
 */
public class AudioFile extends MusicMedia {
    private final String fileType;

    /**
     * This is the constructor for the AudioFile class
     *
     * @param fileType this is the file type of the music entered
     * @param artist this is the artists name for the music
     * @param title this is the title of the music
     * @param yearReleased this is when the music was released
     * @param trackCount this counts the numbers of tracks in that file
     * @param totalMinutes this adds the total number of minutes in the file
     */
    public AudioFile(
            final String fileType,
            final String artist,
            final String title,
            final int yearReleased,
            final int trackCount,
            final int totalMinutes
    ) {
        super(artist, title, yearReleased, trackCount, totalMinutes);

        if(!fileType.equalsIgnoreCase("mp3") &&
                !fileType.equalsIgnoreCase("m4a") &&
                !fileType.equalsIgnoreCase("wav")) {
            throw new IllegalArgumentException("You must only add in files that have a format of mp3, m4a or wav");
        }
        this.fileType = fileType;
    }

    /**
     * This is the method that will play the entire selection of music added to the ArrayList
     */
    public void playSelection() {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the Audio File " + getSongTitle() + " by " + getMusicalArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year " + getYearReleased() + ".\n");
    }

    /**
     * This is the toString() method
     *
     * @return this will return the contents of the AudioFile in a toString format
     */
    @Override
    public String toString() {
        return "AudioFile{" +
                "fileType='" + fileType + '\'' +
                ", Artist='" + getMusicalArtist() + '\'' +
                ", Title='" + getSongTitle() + '\'' +
                ", yearReleased" + getYearReleased() +
                ", trackCount=" + getTotalNumberOfSongs() +
                ", totalMinutes=" + getTotalRuntime() +
                '}';
    }
}
