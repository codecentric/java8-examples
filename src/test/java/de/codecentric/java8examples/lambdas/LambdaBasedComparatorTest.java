package de.codecentric.java8examples.lambdas;

import static de.codecentric.java8examples.TestUtil.getPersons;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import de.codecentric.java8examples.Person;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case showing how a {@link Comparator} can be implemented using a lambda expression.
 */
public class LambdaBasedComparatorTest {

    private List<Person> persons;

    @Before
    public void setUp() throws Exception {
        persons = getPersons();
    }

    @Test
    public void lambdaBasedComparator() throws Exception {
        // comparator is defined on the fly
        Comparator<Person> byLastNameAsc = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

        Collections.sort(persons, byLastNameAsc);

        for (int i = 0; i < persons.size(); i++) {
            Person current = persons.get(i);
            if (i < persons.size() - 1) {
                Person next = persons.get(i + 1);
                assertThat(current.getLastName().compareTo(next.getLastName()), lessThanOrEqualTo(0));
            }
        }
    }
}
