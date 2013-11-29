package de.codecentric.java8examples.streaming;

import de.codecentric.java8examples.Invoice;
import de.codecentric.java8examples.Person;
import de.codecentric.java8examples.TestData;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests for mapping and filtering feature of the streaming api. Once you have completed the stub-methods in
 * {@link FilteringAndMapping}, these tests should pass.
 */
public class CollectingAndReducingTest {
    private List<Person> persons = TestData.listOfPersons();

    private List<Invoice> invoices = TestData.listOfInvoices();
    private List<String> recipients = Arrays.asList("Homer", "Bart", "Marge");

    @Test
    public void testAverageAge() throws Exception {
        assertThat(
                CollectingAndReducing.averageAge(persons),
                closeTo(30.57D, 0.01));
    }

    @Test
    public void testMaxAge() throws Exception {
        assertThat(
                CollectingAndReducing.maxAge(persons),
                equalTo(46));
    }

    @Test
    public void testAgeStatistics() throws Exception {
        IntSummaryStatistics statistic = CollectingAndReducing.ageStatistics(persons);
        assertThat(statistic.getAverage(), equalTo(30.571428571428573));
        assertThat(statistic.getCount(), equalTo(7l));
        assertThat(statistic.getMax(), equalTo(46));
        assertThat(statistic.getMin(), equalTo(1));
        assertThat(statistic.getSum(), equalTo(214l));
    }

    @Test
    public void testBuildCommaSeparatedListOfFirstNames() throws Exception {
        assertThat(
                CollectingAndReducing.buildCommaSeparatedListOfFirstNames(persons),
                equalTo("Jane, Mary, John, Michael, Chris, Pete, Maggie"));
    }

    @Test
    public void testCheapestProduct() throws Exception {
        assertThat(
                CollectingAndReducing.cheapestProduct(invoices),
                equalTo("Chips"));
    }

    @Test
    public void testMostExpensiveInvoice() throws Exception {
        assertThat(
                CollectingAndReducing.mostExpensiveInvoice(invoices),
                equalTo(invoices.get(2)));

    }

    @Test
    public void testGroupInvoicesByRecipient() throws Exception {
        Map<String,List<Invoice>> invoicesByRecipient =
                CollectingAndReducing.groupInvoicesByRecipient(invoices);
        assertThat(invoicesByRecipient.keySet(), hasSize(recipients.size()));

        for (String recipient: recipients) {
            for (Invoice invoice: invoices) {
                if (recipient.equals(invoice.getRecipient())) {
                    assertThat(invoicesByRecipient.get(recipient),
                            hasItem(invoice));
                } else {
                    assertThat(invoicesByRecipient.get(recipient),
                        not(hasItem(invoice)));
                }
            }
        }
    }

    @Test
    public void testExpensesByRecipient() throws Exception {
        Map<String,BigDecimal> expencesByRecipient =
                CollectingAndReducing.expensesByRecipient(invoices);
        assertThat(expencesByRecipient.keySet(), hasSize(invoices.size()));
        for (String recipient: recipients) {
            BigDecimal expenses = BigDecimal.ZERO;
            for (Invoice invoice: invoices) {
                if (recipient.equals(invoice.getRecipient())) {
                    expenses = expenses.add(invoice.getTotal());
                }
            }
            assertThat(expencesByRecipient.get(recipient), equalTo(expenses));
        }
    }

    @Test
    public void testCountByProduct() throws Exception {

    }

    @Test
    public void testCheapestDealersByProduct() throws Exception {

    }

    @Test
    public void testComputeDealerInventory() throws Exception {

    }

    @Test
    public void testFavoriteArticlesByBuyer() throws Exception {

    }
}
