package ca.bcit.comp2501.crn67139.lab11.monikaszucsParhamTony;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Driver.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #11
 *
 * Exploring polymorphism by developing a Music Media Library
 *
 * @author Monika Szucs
 * @version 1.3
 * @2022-06-26
 *
 * This is a driver class that will ask the user for their input and create the objects.
 *
 */
public class Driver {

    private static final int FIRST_CHOICE = 1;
    private static final int SECOND_CHOICE = 2;
    private static final int THIRD_CHOICE = 3;
    private static final int FOURTH_CHOICE = 4;
    private static final int FIFTH_CHOICE = 5;

    private static final int MIN_YEAR_RELEASED = 0;
    private static final int MIN_TOTAL_NUMBER_OF_SONGS = 0;

    /**
     * This is the main method of the Driver class
     *
     * This will ask the user if they want to:
     * 1.Type 1 to add a random Record
     * 2.Type 2 to add a random CompactDisc
     * 3.Type 3 to add a AudioFile
     * 4.Type 4 to add a music media
     * 5.Type 5 to terminate and print out results
     *
     * @param args this is the argument of the main method
     * @since version 1.3
     */
    public static void main(final String[] args) {
        MusicLibrary media;
        Integer choice;
        String playAgain;
        Scanner scanner;
        boolean proceed;

        media = new MusicLibrary();
        scanner = new Scanner(System.in);
        proceed = true;
        playAgain = "yes";

        do {
            System.out.println("What would you like to do? " +
                    "\n1.Type 1 to add a random Record " +
                    "\n2.Type 2 to add a random CompactDisc " +
                    "\n3.Type 3 to add a AudioFile" +
                    "\n4.Type 4 to add a music media" +
                    "\n5.Type 5 to terminate and print out results");
            choice = scanner.nextInt();
            if(choice == FIRST_CHOICE) {
                System.out.println("One");
                media.addMedia(new Record(7, 45.0, "The Beatles", "Hey Jude", 1968,
                        1, 7));
                System.out.println("What would you like to play again. Please enter 'yes'");
                playAgain = scanner.next();
                if(playAgain.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    proceed = false;
                }
            } else if(choice == SECOND_CHOICE) {
                System.out.println("Two");
                media.addMedia(new AudioFile("wav", "Donnie Iris and the Cruisers", "Ah Leah!", 1980,1, 4));
                System.out.println("What would you like to play again. Please enter 'yes'");
                playAgain = scanner.next();
                if(playAgain.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    proceed = false;
                }
            } else if(choice == THIRD_CHOICE) {
                System.out.println("Three");

                media.addMedia(new CompactDisc(false, false, "Neil Young & Crazy Horse",
                        "Everybody Knows This Is Nowhere", 1969,4, 40));
                System.out.println("What would you like to play again. Please enter 'yes'");
                playAgain = scanner.next();
                if(playAgain.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    proceed = false;
                }
            } else if(choice == FOURTH_CHOICE){
                System.out.println("Four");

                String musicalArtist;
                String songTitle;
                Integer totalNumberOfSongs = null;
                Integer totalRuntime;
                Integer yearReleased;
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

                System.out.println("When was the music released?");
                do {
                    yearReleased = scanner.nextInt();
                    if(yearReleased < MIN_YEAR_RELEASED) {
                        continue;
                    } else {
                        keepGoing = false;
                    }
                } while(keepGoing);

                System.out.println("What is the total number of songs?");
                while(!keepGoing) {
                    totalNumberOfSongs = scanner.nextInt();
                    try {
                        if(totalNumberOfSongs <= MIN_TOTAL_NUMBER_OF_SONGS) {
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

                media.addMedia(new MusicMedia(musicalArtist, songTitle, yearReleased, totalNumberOfSongs,
                        totalRuntime));

            } else if(choice == FIFTH_CHOICE) {
                proceed = false;
            } else {
                System.out.println("Not the right number. Please try again");
            }
        } while(proceed);

        media.displayLibrary();
        media.playTitle();
    }
}
