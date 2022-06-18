public class Record extends MusicMedia {
    private final int sizeOfRecordInInches;
    private final double revolutionsPerMinute;

    public Record(
                final int sizeOfRecordInInches,
                final double revolutionsPerMinute,
                final String musicalArtist,
                final String songTitle,
                final int totalNumberOfSongs,
                final int totalRuntime
    ) {
        super(musicalArtist, songTitle, totalNumberOfSongs, totalRuntime);

        if(sizeOfRecordInInches == 7 || sizeOfRecordInInches == 10 || sizeOfRecordInInches == 12) {
            this.sizeOfRecordInInches = sizeOfRecordInInches;
        } else {
            throw new IllegalArgumentException("You do not have the right record size.");
        }

        if(revolutionsPerMinute == 33.3 || revolutionsPerMinute == 45.0 || revolutionsPerMinute == 78.0) {
            this.revolutionsPerMinute = revolutionsPerMinute;
        } else {
            throw new IllegalArgumentException("You do not have the right number for revolutions per minute");
        }
    }

    public int getSizeOfRecordInInches() {
        return sizeOfRecordInInches;
    }

    public double getRevolutionsPerMinute() {
        return revolutionsPerMinute;
    }

    public void playSelection() {
        System.out.println("Record [size=" + sizeOfRecordInInches +
                " rpm=" +  revolutionsPerMinute + ", " + toString() + "]");
    }

    @Override
    public String toString() {
        return "toString()=Album [" +
                "Artist=" + getMusicalArtist() +
                ", title=" + getSongTitle() +
                ", trackCount=" + getTotalNumberOfSongs() +
                ", totalMinutes=" + getTotalRuntime() +
                ']';
    }
}
