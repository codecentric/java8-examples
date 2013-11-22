package de.codecentric.java8examples.defaultmethods;

/**
 * A GreetingService implementation that uses {@link AbstractGreetingService} as base class and therefore has to
 * redefine {@link #greet()}.
 */
public class DerivedGreetingService extends AbstractGreetingService {

    @Override
    public String greet() {
        return "Salut le monde!";
    }
}
