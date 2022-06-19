class MusicMedia {
    private final String    musicalArtist;
    private final String    songTitle;
    private final int       totalNumberOfSongs;
    private final int       totalRuntime;

    private static final int MIN_YEAR = 1900;

    MusicMedia(
            final String musicalArtist,
            final String songTitle,
            final int totalNumberOfSongs,
            final int totalRuntime
    ) {
        if(musicalArtist == null || musicalArtist.isEmpty()) {
            throw new IllegalArgumentException("You must enter in a musical artist name");
        }

        if(songTitle == null || songTitle.isEmpty()) {
            throw new IllegalArgumentException("You must have a song title");
        }

        if(totalNumberOfSongs<= 0) {
            throw new IllegalArgumentException("You cannot have zero or negative songs");
        }

        if(totalRuntime <= 0) {
            throw new IllegalArgumentException("The runtime cannot be 0 or less");
        }

        this.musicalArtist = musicalArtist;
        this.songTitle = songTitle;
        this.totalNumberOfSongs = totalNumberOfSongs;
        this.totalRuntime = totalRuntime;
    }

    public String getMusicalArtist() {
        return musicalArtist;
    }

    public String getSongTitle() {
        return  songTitle;
    }

    public int getTotalNumberOfSongs() {
        return totalNumberOfSongs;
    }

    public int getTotalRuntime() {
        return  totalRuntime;
    }

    public void playSelection() {
        System.out.println("Thank you for using our Music Library \n" +
                "You selected the record: " + songTitle + " by " + musicalArtist + "\n" +
                "This is a Music Media that has " + totalNumberOfSongs + " with a runtime of " + totalRuntime +
                "\n\n"
        );
    }

    @Override
    public String toString() {
        return "MusicMedia{" +
                "musicalArtist='" + musicalArtist + '\'' +
                ", songTitle='" + songTitle + '\'' +
                ", totalNumberOfSongs=" + totalNumberOfSongs +
                ", totalRuntime=" + totalRuntime +
                '}';
    }
}
