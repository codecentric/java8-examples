package de.codecentric.java8examples.defaultmethods;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 14:57
 * To change this template use File | Settings | File Templates.
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
