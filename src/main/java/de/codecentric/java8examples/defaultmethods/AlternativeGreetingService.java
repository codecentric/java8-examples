package de.codecentric.java8examples.defaultmethods;

/**
 * An alternative implementation of GreetingService the provides it's own implementation of {@link #greet()}.
 */
public interface AlternativeGreetingService {

    default String greet() {
        return "Alternative Greeting!";
    }
}
