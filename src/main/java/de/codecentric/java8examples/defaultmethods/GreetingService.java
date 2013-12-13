package de.codecentric.java8examples.defaultmethods;

/**
 * A service that greets you.
 */
public interface GreetingService {

    /**
     * Creates a greeting message. The provided default implementation simply returns "Hello world!"
     *
     * @return A greeting message.
     */
    default String greet() {
        return "Hello World!";
    }

}
