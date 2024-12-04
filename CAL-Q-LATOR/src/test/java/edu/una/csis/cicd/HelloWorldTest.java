package edu.una.csis.cicd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class HelloWorldTest {

    @Test
    public void testUsingJavaNewFeature() {

        SequencedSet<String> alphabet = new LinkedHashSet<>();

        alphabet.add("A");

        assertEquals("A", alphabet.getFirst());
    }
    
    @Test
	public void testMath() throws Exception {
		assertEquals(4, 2 + 2, "bad math");
	}

        @Test
    public void testAddition() {
        int result = 5 + 3;
        assertEquals(8, result, "Addition test failed");
    }

    @Test
    public void testSubtraction() {
        int result = 10 - 4;
        assertEquals(6, result, "Subtraction test failed");
    }

    @Test
    public void testMultiplication() {
        int result = 7 * 6;
        assertEquals(42, result, "Multiplication test failed");
    }

    @Test
    public void testDivision() {
        int result = 20 / 4;
        assertEquals(5, result, "Division test failed");
    }
}
