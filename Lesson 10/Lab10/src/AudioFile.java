public class AudioFile extends MusicMedia {
    private final String fileType;

    public AudioFile(
            final String fileType,
            final String artist,
            final String title,
            final int trackCount,
            final int totalMinutes
    ) {
        super(artist, title, trackCount, totalMinutes);
        this.fileType = fileType;
    }

    public void playSelection() {
        System.out.println("AudioFile [fileType=" + fileType +
                 ", " + toString() + "]");
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
