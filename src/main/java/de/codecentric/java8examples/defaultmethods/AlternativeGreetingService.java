package de.codecentric.java8examples.defaultmethods;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public interface AlternativeGreetingService {

    default String greet() {
        return "Alternative Greeting!";
    }
}
