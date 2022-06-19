import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MusicLibrary {
    private List<MusicMedia> music;

    public MusicLibrary() {
        Integer choice;
        String playAgain;
        Scanner scanner;

        music = new ArrayList<>();

        scanner = new Scanner(System.in);
        boolean proceed;
        proceed = true;
        playAgain = "yes";

        do {
            System.out.println("What would you like to view? " +
                    "\n1.Type 1 for Record " +
                    "\n2.Type 2 for CompactDisc " +
                    "\n3.Type 3 for AudioFile" +
                    "\n4.Type 4 to add a music media" +
                    "\n5.Type 5 to terminate and print out results");
            choice = scanner.nextInt();
            if(choice == 1) {
                System.out.println("One");
                music.add(new Record(7, 45.0, "The Beatles", "Hey Jude",
                        1, 7));
                System.out.println("What would you like to play again. Please enter 'yes'");
                playAgain = scanner.next();
                if(playAgain.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    proceed = false;
                }
            } else if(choice == 2) {
                System.out.println("Two");
                music.add(new AudioFile("wav", "Donnie Iris and the Cruisers", "Ah Leah!", 1, 4));
                System.out.println("What would you like to play again. Please enter 'yes'");
                playAgain = scanner.next();
                if(playAgain.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    proceed = false;
                }
            } else if(choice == 3) {
                System.out.println("Three");
                music.add(new CompactDisc(false, false, "Neil Young & Crazy Horse",
                        "Everybody Knows This Is Nowhere", 4, 40));
                System.out.println("What would you like to play again. Please enter 'yes'");
                playAgain = scanner.next();
                if(playAgain.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    proceed = false;
                }
            } else if(choice == 4){
                System.out.println("Four");
//                musicalArtist,
//                final String songTitle,
//                final int totalNumberOfSongs,
//                final int totalRuntime
                String musicalArtist;
                String songTitle;
                Integer totalNumberOfSongs = null;
                Integer totalRuntime;
                Boolean keepGoing;
                keepGoing = true;
                System.out.println("To add to the music media please fill in some information: ");
                System.out.println("What is the musical artists name?");
                do {
                    musicalArtist = scanner.nextLine();
                    if(musicalArtist == null || musicalArtist.isEmpty()) {
                        continue;
                    } else {
                        keepGoing = false;
                    }
                } while(keepGoing);
                keepGoing = true;

                System.out.println("What is the songs title?");
                do {
                    songTitle = scanner.nextLine();
                    if(songTitle == null || songTitle.isEmpty()) {
                        continue;
                    } else {
                        keepGoing = false;
                    }
                } while(keepGoing);

                System.out.println("What is the total number of songs?");
                while(!keepGoing) {
                    totalNumberOfSongs = scanner.nextInt();
                    try {
                        if(totalNumberOfSongs <= 0) {
                            continue;
                        } else {
                            keepGoing = true;
                        }
                    } catch (InputMismatchException e) {
                        totalNumberOfSongs = scanner.nextInt();
                        System.out.println("This input is not a integer - Please try again");
                    }
                }

                System.out.println("What is the total runtime?");

                totalRuntime = scanner.nextInt();

                System.out.println(musicalArtist);
                System.out.println(songTitle);
                System.out.println(totalNumberOfSongs);
                System.out.println(totalRuntime);

                music.add(new MusicMedia(musicalArtist, songTitle, totalNumberOfSongs,
                        totalRuntime));

            } else if(choice == 5) {
                proceed = false;
            } else {
                System.out.println("Not the right number. Please try again");
            }
        } while(proceed);

        for(MusicMedia m: music) {
            //System.out.println(m);
            m.playSelection();
        }

        for(MusicMedia sentences: music) {
            sentences.toString();
        }
    }

    public void addMedia(MusicMedia media) {
        music.add(media);
    }

    public void displayLibrary() {
        System.out.println(music);
    }

    public void playTitle(String title) {

    }
}
