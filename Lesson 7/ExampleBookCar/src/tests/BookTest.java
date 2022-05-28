import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book b1;
    Book b2;
    Book b3;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up...");
        b1 = new Book("Harry Potter", "Rowling", 1996);
        b2 = new Book("It", "King", 1987);
        b3 = new Book(null, "", 2000);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down...");
        b1 = null;
        b2 = null;
    }

    @Test
    void testGetTitleCaps() {
        assertEquals("HARRY POTTER", b1.getTitleCaps());
        assertEquals("IT", b2.getTitleCaps());
        assertEquals("UNTITLED", b3.getTitleCaps());
    }

    @Test
    void testConstructorGood() {
        assertEquals("Harry Potter", b1.getTitle());
        assertEquals("It", b2.getTitle());

        assertEquals("Rowling", b1.getAuthorLastName());
        assertEquals("King", b2.getAuthorLastName());

        assertTrue(1996 == b1.getYearPublished());
        assertTrue(1987 == b2.getYearPublished());
    }
}