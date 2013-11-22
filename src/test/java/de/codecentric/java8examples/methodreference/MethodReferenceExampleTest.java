package de.codecentric.java8examples.methodreference;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.Callable;

import org.junit.Before;
import org.junit.Test;

/**
 * Test case showing the use of method references.
 */
public class MethodReferenceExampleTest {

    private Foo myFoo;

    @Before
    public void setUp() throws Exception {
        myFoo = new Foo();
    }

    @Test
    public void methodReferencToFooMethod() throws Exception {
        Callable<String> callable = myFoo::doSomething;

        assertEquals(myFoo.doSomething(), callable.call());
    }
}
