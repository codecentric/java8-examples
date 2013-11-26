package de.codecentric.java8examples.streaming;

import de.codecentric.java8examples.Invoice;
import de.codecentric.java8examples.Person;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Your task: Implement the following methods and make the tests passs.
 */
public class FilteringAndMapping {

    /**
     * Extract a list of names (firstname and lastname separated by space) from a given list of Person objects.
     */
    public static List<String> extractNames(List<Person> persons) {
        return Collections.emptyList();
    }

    /**
     * Extract a sorted (ascending by lastname) list of names (firstname and lastname separated by space) from a
     * given list of Person objects.
     */
    public static List<String> extractNamesSortedByLastname(List<Person> persons) {
        return Collections.emptyList();
    }

    /**
     * From a given list of Person objects, extract a list of female firstnames
     */
    public static List<String> extractFemaleFirstnames(List<Person> persons) {
        return Collections.emptyList();
    }

    /**
     * Extract all females older than 18 years from a given list of Person objects.
     */
    public static List<Person> extractAdultWomen(List<Person> persons) {
        return Collections.emptyList();
    }

    /**
     * From a given list of Person objects, extract a set of firstnames of the people whose lastname starts
     * with the given string.
     */
    public static Set<String> extractFirstnamesWhereLastnameStartsWith(List<Person> persons, String startsWith) {
        return Collections.emptySet();
    }

    /**
     * From a given list of invoices, extract a set of all product names.
     */
    public static Set<String> extractAllProducts(List<Invoice> invoices) {
        return Collections.emptySet();
    }
}

