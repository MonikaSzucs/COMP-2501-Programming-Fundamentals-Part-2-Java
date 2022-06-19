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
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the Audio File " + getSongTitle() + " by " + getMusicalArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year  .\n");
    }

    @Override
    public String toString() {
        return "AudioFile{" +
                "fileType='" + fileType + '\'' +
                ", Artist='" + getMusicalArtist() + '\'' +
                ", Title='" + getSongTitle() + '\'' +
                ", trackCount=" + getTotalNumberOfSongs() +
                ", totalMinutes=" + getTotalRuntime() +
                '}';
    }
}
