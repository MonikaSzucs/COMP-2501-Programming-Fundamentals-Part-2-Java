import java.util.Locale;

public class Book {
    private final String title;
    private final String authorLastName;
    private final int yearPublished;

    public Book(final String title,
                final String authorLastName,
                final int yearPublished) {

        if(title == null) {
            this.title = "untitled";
        } else {
            this.title = title;
        }
        this.authorLastName = authorLastName;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getTitleCaps() {
        return title.toUpperCase();
    }
}
