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
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the CD " + getSongTitle() + " by " + getMusicalArtist() + ".");
        System.out.println("This is a Compact Disc from the year   .\n");
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "bonusTracks=" + bonusTracks +
                ", digipac=" + digipac +
                ", Artist='" + getMusicalArtist() + '\'' +
                ", Title='" + getSongTitle() + '\'' +
                ", trackCount=" + getTotalNumberOfSongs() +
                ", totalMinutes=" + getTotalRuntime() +
                '}';
    }
}
