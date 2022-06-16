class MusicMedia {
    private final String    musicalArtist;
    private final String    songTitle;
    private final int       totalNumberOfSongs;
    private final double    totalRuntime;
    private final int       year;

    MusicMedia(final String musicalArtist,
               final String songTitle,
               final int totalNumberOfSongs,
               final double totalRuntime,
               final int year
    ) {
        this.musicalArtist = musicalArtist;
        this.songTitle = songTitle;
        this.totalNumberOfSongs = totalNumberOfSongs;
        this.totalRuntime = totalRuntime;
        this.year = year;
    }
}
