import javax.naming.directory.SearchResult;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment2 {

    private Agency agency;
    @SuppressWarnings("unused")
    private SearchResult searches;
    private Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        Assignment2 a2 = new Assignment2();
        a2.init();
        a2.doSearches();
    }
}
