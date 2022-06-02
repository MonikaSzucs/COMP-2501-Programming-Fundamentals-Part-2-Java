import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExecution {

    public static void main(final String[] args) throws FileNotFoundException {
        File file = new File("DemoDriver.txt");

        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
    }
}
