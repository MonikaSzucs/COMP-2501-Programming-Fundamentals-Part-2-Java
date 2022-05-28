import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book b1;
    Book b2;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up...");
        b1 = new Book("Harry Potter", "Rowling", 1996);
        b2 = new Book("It", "King", 1987);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down...");
        b1 = null;
        b2 = null;
    }

    @Test
    void testConstructorGood() {
        assertEquals("Harry Potter", b1.getTitle());
        assertEquals("It", b2.getTitle());
    }
}