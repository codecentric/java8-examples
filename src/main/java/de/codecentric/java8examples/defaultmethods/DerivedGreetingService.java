package de.codecentric.java8examples.defaultmethods;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 */
public class DerivedGreetingService extends AbstractGreetingService {

    @Override
    public String greet() {
        return "Salut le monde!";
    }
}
