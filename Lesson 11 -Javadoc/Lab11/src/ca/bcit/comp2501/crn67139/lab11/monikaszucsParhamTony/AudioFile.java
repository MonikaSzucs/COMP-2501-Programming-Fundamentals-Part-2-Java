package ca.bcit.comp2501.crn67139.lab11.monikaszucsParhamTony;

/**
 * AudioFile.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #11
 *
 * Exploring polymorphism by developing a Music Media Library
 *
 * @author Monika Szucs
 * @version 1.3
 * @2022-06-26
 *
 * This is an audio file class that will check the audio file created
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
     * @since version 1.3
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
     * This is the method that will get the information of the song containing the:
     * getSongTitle, getMusicalArtist, fileType, getYearReleased
     * @since version 1.3
     */
    public void playSelection() {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the Audio File " + getSongTitle() + " by " + getMusicalArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year " + getYearReleased() + ".\n");
    }

    /**
     * This is the toString() method generating the string from the other methods:
     * fileType, getMusicalArtist, getSongTitle, getYearReleased, getTotalNumberOfSongs, getTotalRuntime
     *
     * @return this will return the contents of the AudioFile in a toString format
     * @since version 1.3
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
