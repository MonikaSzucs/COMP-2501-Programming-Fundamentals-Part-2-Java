public class Notebook {
    private Note[] notes;

    Notebook()
    {
        notes = new Note[10];
        notes[2] = new Note("work hard", "goggins");
        System.out.println(notes.length);

        for(Note n:notes)
        {
            if(n != null)
            {
                System.out.println(n.getNote() + " by " + n.getAuthorLastName());
            }
        }
    }
}
