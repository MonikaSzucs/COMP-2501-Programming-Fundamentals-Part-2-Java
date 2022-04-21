public class Note {
    private final String note;
    private final String authorLastName;

    public Note(String note, String authorLastName) {
        this.note = note;

        this.authorLastName = authorLastName;
    }

    public String getNote()
    {
        return note;
    }
    public String getAuthorLastName()
    {
        return authorLastName;
    }
}
