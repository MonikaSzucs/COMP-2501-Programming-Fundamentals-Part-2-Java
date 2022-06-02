import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssemblerTest {
    Assembler food;
    Assembler food2;

    @BeforeEach
    void setUp() {
        System.out.println("Getting set up...");
        food = new Assembler("Hot Dog", "Wheet", "pork",
                "ketchup", "null", 1);

        food2 = new Assembler("Burger", "Wheet", "pork",
                "ketchup", "null", 1);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down...");
        food = null;
    }

    @Test
    void testCreateHotDog() {
        assertEquals("Hot Dog", food.getFoodType());
        assertEquals("Burger", food2.getFoodType());
    }
}