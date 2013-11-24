package de.codecentric.java8examples.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * An example for the use of functional interfaces which can be implemented using lambda expressions. Wraps an
 * element of type {@code E} and let's you apply functional interfaces like {@link Function}, {@link Predicate}, and
 * {@link Consumer} to the wrapped element.
 *
 * Look at the LambdaExampleTest to see lambdas in action.
 *
 * @param <E> The type of the element to be wrapped
 */
public class LambdaExample<E> {

    private E elem;

    public LambdaExample(E elem) {
        this.elem = elem;
    }

    /**
     * Applies the given {@link Function} to the wrapped element and returns the result.
     * @param function the function to apply to the wrapped element.
     * @param <R> the return type of the function application
     * @return the result of applying the given function to the wrapped element.
     */
    public <R> R apply(Function<? super E, ? extends R> function) {
        return function.apply(elem);
    }

    /**
     * Tests whether the wrapped element satisfies the given predicate.
     * @param predicate the predicate used for testing
     * @return true, if the wrapped element satisfies the given predicate and false otherwise
     */
    public boolean matches(Predicate<? super E> predicate) {
        return predicate.test(elem);
    }

    /**
     * Passes the wrapped element to the given consumer.
     * @param consumer the consumer to pass the wrapped element to
     */
    public void consume(Consumer<? super E> consumer) {
        consumer.accept(elem);
    }
}
