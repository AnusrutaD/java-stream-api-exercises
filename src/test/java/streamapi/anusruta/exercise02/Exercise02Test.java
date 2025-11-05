package streamapi.anusruta.exercise02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise02Test {
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;
    private Exercise02 exercise02;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        exercise02 = new Exercise02();
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void main_printsPlaceholder() {
        Exercise02.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("strs in Uppercase:"));
    }

    @Test
    void testToUppercase() {
        List<String> strs = Arrays.asList("AbC", "dEf", "GHi");
        assertEquals(Arrays.asList("ABC", "DEF", "GHI"), exercise02.toUppercase(strs));
    }

    @Test
    void testToLowercase() {
        List<String> strs = Arrays.asList("AbC", "dEf", "GHi");
        assertEquals(Arrays.asList("abc", "def", "ghi"), exercise02.toLowercase(strs));
    }
}


