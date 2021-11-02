package demo;

import java.util.function.DoubleConsumer;

public class Algorithm {

    public void run(final double from, final double until, final DoubleConsumer consumer) {
        for (double i = from; i < until; i++) {
            consumer.accept(i);
        }
    }
}
