package de.codecentric.java8examples.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * A transformer that uses functional interfaces which can be implemented using lambda expressions. Look at the
 * TransformerTest to see lambdas in action.
 */
public class LambdaExample<E> {

    private E elem;

    public LambdaExample(E elem) {
        this.elem = elem;
    }

    public <R> R transform(Function<? super E, ? extends R> transformation) {
        return transformation.apply(elem);
    }

    public boolean matches(Predicate<? super E> test) {
        return test.test(elem);
    }

    public void consume(Consumer<? super E> consumer) {
        consumer.accept(elem);
    }
}
