package de.codecentric.java8examples.defaultmethods;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 14:59
 * To change this template use File | Settings | File Templates.
 */
abstract class AbstractGreetingService implements GreetingService {

    @Override
    public abstract String greet();

}
