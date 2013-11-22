package de.codecentric.java8examples.defaultmethods;

/**
 * A GreetingService implementation that overrides to provided default method.
 */
public class ExtendedGreetingService implements GreetingService {

    private String name;

    public ExtendedGreetingService(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "Hello " + name + "!";
    }
}
