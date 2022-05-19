import java.util.ArrayList;

public class processNotes {
    public static void processNotes(final ArrayList<String> notes, final double someNumber)
    {
        if(notes != null && !notes.isEmpty())
        {
            for(String note:notes)
            {
                if(note != null && !note.isBlank())
                {
                    if(note.toLowerCase().startsWith("hello") ||
                            note.toLowerCase().endsWith("hello") ||
                            note.toLowerCase().contains("goodbye"))
                    {
                        System.out.println(note.toLowerCase());
                    }
                }
            }
        }
        System.out.printf("The value of someNumber is %.3f", someNumber);
    }

}
