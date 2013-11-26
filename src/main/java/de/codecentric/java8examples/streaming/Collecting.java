package de.codecentric.java8examples.streaming;

import de.codecentric.java8examples.Invoice;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Your task: Implement the following methods and make the tests passs.
 */
public class Collecting {

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
     * For every product, compute the cheapest dealer. Return as a Map where the key is the product name and the value
     * is the dealer (=sender of the invoice).
     */
    public static Map<String, String> cheapestDealersByProduct() {
        return Collections.emptyMap();
    }

}
