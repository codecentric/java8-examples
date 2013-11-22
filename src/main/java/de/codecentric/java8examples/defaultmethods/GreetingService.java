package de.codecentric.java8examples.defaultmethods;

/**
 * A service that greets you.
 */
public interface GreetingService {

    default String greet() {
        return "Hello World!";
    }

}
