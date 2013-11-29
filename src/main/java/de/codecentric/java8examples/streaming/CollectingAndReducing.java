package de.codecentric.java8examples.streaming;

import de.codecentric.java8examples.Invoice;
import de.codecentric.java8examples.Person;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

/**
 * Your task: Implement the following methods and make the tests passs.
 */
public class CollectingAndReducing {

    /**
     * Compute the average age of the given list of Persons.
     */
    public static Double averageAge(List<Person> persons) {
        return Double.valueOf(0);
    }

    /**
     * How old is the oldest person in the given list.
     */
    public static Integer maxAge(List<Person> persons) {
        return Integer.valueOf(0);
    }

    /**
     * Compute Age-Statistics (max, min, average, ...) for the given list of Persons.
     */
    public static DoubleSummaryStatistics ageStatistics(List<Person> persons) {
        return null;
    }

    /**
     * Build a comma-separated list of the firstnames of a list of Persons.
     *
     * Example-Result: "Maggie, Marge, Mary"
     */
    public static String buildCommaSeparatedListOfFirstNames(List<Person> persons) {
        return "";
    }

    /**
     * Identify the cheapest product (by pricePerUnit) in all invoices.
     */
    public static String cheapestProduct(List<Invoice> invoices) {
        return "";
    }

    /**
     * Identify the invoice with the highest total amount.
     */
    public static Invoice mostExpensiveInvoice(List<Invoice> invoices) {
        return null;
    }

    /**
     * Just what the method name says.
     */
    public static Map<String, List<Invoice>> groupInvoicesByReceiver(List<Invoice> invoices) {
        return Collections.emptyMap();
    }

    /**
     * Compute the total amount, that each receiver spent.
     *
     * Hint: Use the two-argument version of Collectors.groupingBy together with Collectors.mapping.
     */
    public static Map<String, BigDecimal> expensesByReceiver(List<Invoice> invoices) {
        return Collections.emptyMap();
    }

    /**
     * How many items of each product have been purchased?
     */
    public static Map<String, String> countByProduct(List<Invoice> invoices) {
        return Collections.emptyMap();
    }

    /**
     * For every product, compute the cheapest dealer. Return as a Map where the key is the product name and the value
     * is the dealer (=sender of the invoice).
     */
    public static Map<String, String> cheapestDealersByProduct(List<Invoice> invoices) {
        return Collections.emptyMap();
    }

    /**
     * From a given list of invoices, compute for every dealer the available products together with its price.
     */
    public static Map<String, ProductWithPrice> computeDealerInventory(List<Invoice> invoices) {
        return Collections.emptyMap();
    }

    /**
     * For every buyer, compute a list of his favorite products (that is: a list of products ordered by the total count
     * of items bought).
     * For example: Homer bought 5 beers at Moes, 2 beers and a burger at Crustys. Then the result should look like this:
     * {"Homer" -> ["Beer", "Burger"]}
     */
    public static Map<String, List<String>> favoriteArticlesByBuyer(List<Invoice> invoices) {
        return Collections.EMPTY_MAP;
    }

    public static class ProductWithPrice {
        private String productName;
        private BigDecimal price;

        public ProductWithPrice(String productName, BigDecimal price) {
            this.productName = productName;
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public BigDecimal getPrice() {
            return price;
        }
    }

}
