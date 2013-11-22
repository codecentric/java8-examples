package de.codecentric.java8examples.defaultmethods;

/**
 * An abstract base class for GreetingService implementations that forces derived classes to implement {@link #greet()}
 * by making it abstract.
 */
abstract class AbstractGreetingService implements GreetingService {

    @Override
    public abstract String greet();

}
