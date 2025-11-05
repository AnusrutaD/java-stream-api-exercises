package streamapi.anusruta.exercise01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise01Test {
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;
    private Exercise01 exercise01;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        exercise01 = new Exercise01();
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void main_printsPlaceholder() {
        Exercise01.main(new String[]{});
        String output = outContent.toString();

        assertTrue(output.contains("Average: 17.75"));
    }

    @Test
    void testCalculateAverage() {
        assertEquals(2.5, exercise01.calculateAverage(Arrays.asList(1, 2, 3, 4)));
    }
}


