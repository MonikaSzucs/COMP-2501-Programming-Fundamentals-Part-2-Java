package ca.bcit.comp2501.crn67139.lab11.monikaszucsParhamTony;

/**
 * CompactDisc.java
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
 * This is a driver class that will ask the user for their input and create the objects.
 *
 */
public class CompactDisc extends MusicMedia {
    private final boolean bonusTracks;
    private final boolean digipac;

    /**
     * This is the constructor for the CompactDisc
     *
     * @param bonusTracks this contains the bonus tracks
     * @param digipac this contains the digipac
     * @param artist this contains the artists name
     * @param title this contains the title of the song
     * @param yearReleased this contains the year released
     * @param trackCount this contains the number of tracks counted
     * @param totalMinutes this contains the total number of minutes within the track
     * @since version 1.1
     */
    public CompactDisc( final boolean bonusTracks,
                        final boolean digipac,
                        final String artist,
                        final String title,
                        final int yearReleased,
                        final int trackCount,
                        final int totalMinutes
    ) {
        super(artist, title, yearReleased, trackCount, totalMinutes);
        this.bonusTracks = bonusTracks;
        this.digipac = digipac;
    }

    /**
     * This is the method for the playSelection() to show the output of the compact disc content
     * @since version 1.1
     */
    public void playSelection() {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the CD " + getSongTitle() + " by " + getMusicalArtist() + ".");
        System.out.println("This is a Compact Disc from the year " + getYearReleased() + ".\n");
    }

    /**
     * This is the toString method for the CompactDisc
     *
     * @return the toString format of the entire CompactDisc
     * @since version 1.3
     */
    @Override
    public String toString() {
        return "CompactDisc{" +
                "bonusTracks=" + bonusTracks +
                ", digipac=" + digipac +
                ", Artist='" + getMusicalArtist() + '\'' +
                ", Title='" + getSongTitle() + '\'' +
                ", yearReleased=" + getYearReleased() +
                ", trackCount=" + getTotalNumberOfSongs() +
                ", totalMinutes=" + getTotalRuntime() +
                '}';
    }
}
