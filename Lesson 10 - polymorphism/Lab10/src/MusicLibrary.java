import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * MusicLibrary.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #10
 *
 * Exploring polymorphism by developing a Music Media Library
 *
 * @author Monika Szucs
 * @author Yao Linkun
 *
 * @version 1.2
 *
 * This is a driver class that will ask the user for their input and create the objects.
 *
 */
public class MusicLibrary {
    private List<MusicMedia> music;

    /**
     * This is the music Library constructor that instantiates an ArrayList of music
     */
    public MusicLibrary() {
        music = new ArrayList<>();
    }

    /**
     * This is a addMedia method that will add the MusicMedia object to the music ArrayList
     *
     * @param media this is the MusicMedia object contents
     */
    public void addMedia(MusicMedia media) {
        if(media == null) {
            throw new IllegalArgumentException("This media obejct is null. Please check all objects have the right number of instance variables");
        }
        music.add(media);
    }

    /**
     * This will display the library of contents in the ArrayList
     */
    public void displayLibrary() {
        for(MusicMedia musicOne: music) {
            System.out.println(musicOne);
        }

        System.out.println("");
    }

    /**
     * This will show all the information for the different items in the ArrayList
     */
    public void playTitle() {
        for(MusicMedia m: music) {
            //System.out.println(m);
            m.playSelection();
        }

        for(MusicMedia sentences: music) {
            sentences.toString();
        }
    }
}
