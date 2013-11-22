package de.codecentric.java8examples.methodreference;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.Callable;

import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: bene
 * Date: 04.10.13
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
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
