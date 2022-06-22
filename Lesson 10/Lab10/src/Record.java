/**
 * Record.java
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
public class Record extends MusicMedia {
    private final int sizeOfRecordInInches;
    private final double revolutionsPerMinute;

    private static final int FIRST_SIZE_OF_RECORD_IN_INCHES = 7;
    private static final int SECOND_SIZE_OF_RECORD_IN_INCHES = 10;
    private static final int THIRD_SIZE_OF_RECORD_IN_INCHES = 12;

    private static final double FIRST_REVOLUTIONS_PER_MINUTE = 33.3;
    private static final double SECOND_REVOLUTIONS_PER_MINUTE = 45.0;
    private static final double THIRD_REVOLUTIONS_PER_MINUTE = 78.0;

    /**
     * This is the constructor for the Record class
     *
     * @param sizeOfRecordInInches
     * @param revolutionsPerMinute
     * @param musicalArtist
     * @param songTitle
     * @param yearReleased
     * @param totalNumberOfSongs
     * @param totalRuntime
     */
    public Record(
            final int sizeOfRecordInInches,
            final double revolutionsPerMinute,
            final String musicalArtist,
            final String songTitle,
            final int yearReleased,
            final int totalNumberOfSongs,
            final int totalRuntime
    ) {
        super(musicalArtist, songTitle, yearReleased, totalNumberOfSongs, totalRuntime);

        if(     sizeOfRecordInInches == FIRST_SIZE_OF_RECORD_IN_INCHES ||
                sizeOfRecordInInches == SECOND_SIZE_OF_RECORD_IN_INCHES ||
                sizeOfRecordInInches == THIRD_SIZE_OF_RECORD_IN_INCHES) {
            this.sizeOfRecordInInches = sizeOfRecordInInches;
        } else {
            throw new IllegalArgumentException("You do not have the right record size.");
        }

        if(     revolutionsPerMinute == FIRST_REVOLUTIONS_PER_MINUTE ||
                revolutionsPerMinute == SECOND_REVOLUTIONS_PER_MINUTE ||
                revolutionsPerMinute == THIRD_REVOLUTIONS_PER_MINUTE) {
            this.revolutionsPerMinute = revolutionsPerMinute;
        } else {
            throw new IllegalArgumentException("You do not have the right number for revolutions per minute");
        }
    }

    /**
     * This is the getter for the size of records in inches
     *
     * @return this will return the size of the record in inches
     */
    public int getSizeOfRecordInInches() {
        return sizeOfRecordInInches;
    }

    /**
     * This is the getter for the revolutions per minute
     *
     * @return this will return the revolutions per minute
     */
    public double getRevolutionsPerMinute() {
        return revolutionsPerMinute;
    }

    /**
     * This is the playSelection method that will print out all the content for the music stored
     */
    public void playSelection() {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the record " + getSongTitle() + " by " + getMusicalArtist() + ".");
        System.out.println("This is a " + sizeOfRecordInInches + " inch record from " + getYearReleased() + ", playing at " +
                revolutionsPerMinute +" rpm.\n");
    }

    /**
     * This is the toString method that will print out a string
     *
     * @return this will return a string formatted sentence containing all the contents of the record
     */
    @Override
    public String toString() {
        return "Record [" +
                "size=" + sizeOfRecordInInches +
                ", rpm=" +  revolutionsPerMinute +
                ", Artist=" + getMusicalArtist() +
                ", Title=" + getSongTitle() +
                ", Year Released=" + getYearReleased() +
                ", trackCount=" + getTotalNumberOfSongs() +
                ", totalMinutes=" + getTotalRuntime() +
                "]";
    }
}
