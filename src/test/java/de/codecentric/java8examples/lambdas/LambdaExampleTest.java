package de.codecentric.java8examples.lambdas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.function.Predicate;

import de.codecentric.java8examples.Person;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case showing how lambda expressions work.
 */
public class LambdaExampleTest {

    private LambdaExample<Person> example;
    private Person peter;

    @Before
    public void setUp() throws Exception {
        // Nerd info: 5/15/1962 was the release date of Amazing Fantasy #15, where Spider Man had his first appearance
        peter = new Person("Peter", "Parker", LocalDate.of(1962, 8, 15), Person.Gender.MALE);
        example = new LambdaExample<>(peter);
    }

    @Test
    public void peterIsOlderThan30() throws Exception {
        // old school
        assertTrue(example.matches(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() > 30;
            }
        }));
    }

    @Test
    public void peterIsOlderThan30WithBlockLambda() throws Exception {
        // new: implement the predicate using a block lambda expression
        assertTrue(example.matches((Person p) -> {
            return p.getAge() > 30;
        }));
    }

    @Test
    public void peterIsOlderThan30WithOneLineLambda() throws Exception {
        // implement the predicate using a one line lambda expression
        assertTrue(example.matches((Person person) -> person.getAge() > 30));
    }

    @Test
    public void peterIsOlderThan30WithTypeInference() throws Exception {
        // even shorter: let the compiler work out the correct type
        assertTrue(example.matches(p -> p.getAge() > 30));
    }

    @Test
    public void getAgeFromWrappedElementViaFunctionApplication() throws Exception {
        // type is inferred from context
        assertEquals("Parker", example.apply(p -> p.getLastName()));
    }

    @Test
    public void changeStateOfWrappedElementViaConsumer() throws Exception {
        // this will change the state of the wrapped element!
        example.consume(p -> p.setGender(oppositeOf(p.getGender())));

        assertEquals(Person.Gender.FEMALE, peter.getGender());
    }

    private static Person.Gender oppositeOf(Person.Gender gender) {
        if (gender.equals(Person.Gender.MALE))
            return Person.Gender.FEMALE;
        else
            return Person.Gender.MALE;
    }
}
