public class CompactDisc extends MusicMedia {
    private final boolean bonusTracks;
    private final boolean digipac;

    public CompactDisc(final boolean bonusTracks,
                       final boolean digipac,
                       final String artist,
                       final String title,
                       final int trackCount,
                       final int totalMinutes) {
        super(artist, title, trackCount, totalMinutes);
        this.bonusTracks = bonusTracks;
        this.digipac = digipac;
    }

    public void playSelection() {
        System.out.println("CompactDisc [bonusTracks=" + bonusTracks + " digipac=" + digipac +
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
