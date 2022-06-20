import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MusicLibrary {
    private List<MusicMedia> music;

    public MusicLibrary() {
        music = new ArrayList<>();
    }

    public void addMedia(MusicMedia media) {
        music.add(media);
    }

    public void displayLibrary() {
        //System.out.println(music);

        for(MusicMedia m: music) {
            //System.out.println(m);
            m.playSelection();
        }

        for(MusicMedia sentences: music) {
            sentences.toString();
        }
    }

    public void playTitle(String title) {

    }
}
