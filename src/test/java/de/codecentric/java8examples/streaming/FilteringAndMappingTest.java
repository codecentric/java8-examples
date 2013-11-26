package de.codecentric.java8examples.streaming;

import de.codecentric.java8examples.Invoice;
import de.codecentric.java8examples.Person;
import de.codecentric.java8examples.TestData;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Tests for mapping and filtering feature of the streaming api. Once you have completed the stub-methods in
 * {@link FilteringAndMapping}, these tests should pass.
 */
public class FilteringAndMappingTest {

    private List<Person> persons = TestData.listOfPersons();

    private List<Invoice> invoices = TestData.listOfInvoices();

    @Test
    public void collectFirstNamesOfFemales() throws Exception {
        // Matchers.contains should really be called "containsExactlyTheseElementsAndNoOtherElementsInExactlyThisOrder"
        // I hate hamcrest :(
        assertThat(FilteringAndMapping.extractFemaleFirstnames(persons), contains("Jane", "Mary", "Maggie"));
    }

    @Test
    public void extractNames() {
        assertThat(
                FilteringAndMapping.extractNames(persons.subList(0, 6)),
                contains("Jane Jungle", "Mary Smitch", "John Dole", "Michael Abrams", "Chris Cross", "Peter Power"));
    }

    @Test
    public void extractNamesSortedByLastname() {
        assertThat(
                FilteringAndMapping.extractNamesSortedByLastname(persons.subList(0, 6)),
                contains("Michael Abrams", "Chris Cross", "John Dole", "Jane Jungle", "Peter Power", "Mary Smitch"));
    }

    @Test
    public void extractAdultWomen() {
        // Yes, I know, this test is time-dependent and will break in a few months/years...
        assertThat(
                FilteringAndMapping.extractAdultWomen(persons),
                contains(
                        persons.get(0),
                        persons.get(1)));
    }

    @Test
    public void extractFirstnamesWhereLastnameStartsWith() {
        assertThat(
                FilteringAndMapping.extractFirstnamesWhereLastnameStartsWith(persons, "S"),
                contains("Mary", "Maggie"));
    }

    @Test
    public void testExtractAllProducts() throws Exception {
        MatcherAssert.assertThat(FilteringAndMapping.extractAllProducts(invoices),
                containsInAnyOrder("Beer", "Burrito", "Coke"));
    }
}
