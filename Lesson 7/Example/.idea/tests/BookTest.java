import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

//import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book b1;
    Book b2;

    @BeforeEach
    void setUp() {
        System.out.println("setting up...");
        b1 = new Book("Harry Potter", "Rowling", 1996);
        b2 = new Book("It", "Rowling", 1980);
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearing down...");
        b1 = null;
        b2 = null;
    }

    @Test
    void testGetTitleCaps() {
        assertEquals("HARRY POTTER", b1.getTitleCaps());
        assertEquals("IT", b2.getTitleCaps());
    }

    @Test
    void testConstructorGood() {
        assertEquals("Harry Potter", b1.getTitle());
        assertEquals("It", b2.getTitle());
    }
}