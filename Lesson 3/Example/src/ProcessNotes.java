import java.util.ArrayList;
import java.util.Locale;

class ProcessNotes {
    private final ArrayList<String> notes;

    ProcessNotes()
    {
        notes = new ArrayList<>();
        double someNumber = 0;

        notes.add("hello");
        notes.add("HEllo");
        notes.add("goodbye");
        notes.add("gooDBye");

        if(notes != null || !notes.isEmpty())
        {
            for(final String note: notes)
            {
                if(note != null || !notes.isEmpty())
                {
                    System.out.println(note.toLowerCase());
                    someNumber++;
                }
            }
        }
        System.out.printf("The number of times the word shows up is %.3f", someNumber);
    }

    public static void main(final String[] args)
    {
        ProcessNotes process;
        process = new ProcessNotes();
    }
}
