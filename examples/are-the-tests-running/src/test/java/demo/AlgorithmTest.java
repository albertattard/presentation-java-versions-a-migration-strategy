package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmTest {

    @Test
    void addsTwoNumbers() {
        final Algorithm algorithm = new Algorithm();
        final int result = algorithm.add(2, 4);

        assertEquals(6, result);
    }
}
