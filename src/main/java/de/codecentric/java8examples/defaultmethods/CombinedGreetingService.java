package de.codecentric.java8examples.defaultmethods;

/**
 * A greeting service implementation that inherits {@link #greet()} from two unrelated interfaces. It has to provide
 * an implementation for {@code greet()}.
 */
public class CombinedGreetingService implements GreetingService, AlternativeGreetingService {

    /**
     * An implementation of the {@code greet()} method which is defined in both, {@link GreetingService} and
     * {@link AlternativeGreetingService}. This implementation simply delegates to the default {@code greet()}
     * implementation of the {@code GreetingService} interface
     *
     * @return the result of calling {@link GreetingService#greet()}.
     */
    @Override
    public String greet() {
        return GreetingService.super.greet();
    }
}
