package de.codecentric.java8examples.defaultmethods;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 14:54
 * To change this template use File | Settings | File Templates.
 */
public class GreetingServiceTest {

    @Test
    public void greetFromDefault() throws Exception {
        assertEquals("Hello World!", new DefaultGreetingService().greet());
    }

    @Test
    public void greetFromExtended() throws Exception {
        assertEquals("Hello Pete!", new ExtendedGreetingService("Pete").greet());
    }

    @Test
    public void greetFromDerived() throws Exception {
        assertEquals("Salut le monde!", new DerivedGreetingService().greet());
    }
}
