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
public class MethodReferenceTest {

    private MethodReference ref;

    @Before
    public void setUp() throws Exception {
        ref = new MethodReference();
    }

    @Test
    public void callingMethodFromRunnable() throws Exception {
        Callable<String> callable = ref::doSomething;

        assertEquals(ref.doSomething(), callable.call());
    }
}
