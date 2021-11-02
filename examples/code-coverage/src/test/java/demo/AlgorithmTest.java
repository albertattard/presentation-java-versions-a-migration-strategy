package demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmTest {

    @Test
    void run4Times() {
        final List<Double> values = new ArrayList<>();
        final DoubleConsumer consumer = values::add;

        final Algorithm algorithm = new Algorithm();
        algorithm.run(1D, 5D, consumer);

        final List<Double> expected = List.of(1D, 2D, 3D, 4D);
        assertEquals(expected, values);
    }

    @Test
    void runsForever() {
        final List<Double> values = new ArrayList<>();
        final DoubleConsumer consumer = values::add;

        final Algorithm algorithm = new Algorithm();
        algorithm.run(1_000_000_000_000_000_1D, 1_000_000_000_000_000_5D, consumer);

        final List<Double> expected = List.of(1_000_000_000_000_000_1D,
                1_000_000_000_000_000_2D,
                1_000_000_000_000_000_3D,
                1_000_000_000_000_000_4D);
        assertEquals(expected, values);
    }
}
