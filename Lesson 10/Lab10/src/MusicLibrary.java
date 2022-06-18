import java.lang.reflect.Array;
import java.util.ArrayList;
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
            System.out.println("What would you like to view first? \n1.Type 1 for Record \n2.Type 2 for CompactDisc \n3.Type 3 for AudioFile");
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
            } else {
                System.out.println("Not the right number. Please try again");
            }
        } while(proceed);

        for(MusicMedia m: music) {
            m.playSelection();
        }
    }

    public void addMedia(MusicMedia media) {

    }

    public void displayLibrary() {

    }

    public void playTitle(String title) {

    }
}
