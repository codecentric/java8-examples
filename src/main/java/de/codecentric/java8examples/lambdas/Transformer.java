package de.codecentric.java8examples.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */
public class Transformer<E> {

    private E elem;

    public Transformer(E elem) {
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
