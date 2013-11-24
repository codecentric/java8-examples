package de.codecentric.java8examples.lambdas;

import static de.codecentric.java8examples.TestUtil.dateOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        peter = new Person("Peter", "Parker", dateOf(8, 15, 1962), Person.Gender.MALE);
        example = new LambdaExample<Person>(peter);
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

        // new: implement the predicate using lambda expression
        assertTrue(example.matches((Person person) -> person.getAge() > 30));

        // even shorter: let the compiler work out the correct type
        assertTrue(example.matches(p -> p.getAge() > 30));
    }

    @Test
    public void printAge() throws Exception {
        // type is inferred from context
        assertEquals("Parker", example.apply(p -> p.getLastName()));
    }

    @Test
    public void transgendering() throws Exception {
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
