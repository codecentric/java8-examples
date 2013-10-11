package de.codecentric.java8examples.defaultmethods;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */
public interface GreetingService {

    default String greet() {
        return "Hello World!";
    }

}
