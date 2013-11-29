package de.codecentric.java8examples.streaming;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.codecentric.java8examples.Invoice;
import de.codecentric.java8examples.InvoiceItem;
import de.codecentric.java8examples.Person;

/**
 * Your task: Implement the following methods and make the tests passs.
 */
public class FilteringAndMapping {

    /**
     * Extract a list of names (firstname and lastname separated by space) from a given list of Person objects.
     */
    public static List<String> extractNames(List<Person> persons) {
	return persons.stream()//
		.<String> map(p -> p.getFirstName() + " " + p.getLastName())//
		.collect(Collectors.<String> toList());
    }

    /**
     * Extract a sorted (ascending by lastname) list of names (firstname and lastname separated by space) from a given list of Person objects.
     */
    public static List<String> extractNamesSortedByLastname(List<Person> persons) {
	return persons.stream()//
		.sorted((Person p1, Person p2) -> (p1.getLastName().compareTo(p2.getLastName())))//
		.<String> map(p -> p.getFirstName() + " " + p.getLastName())//
		.collect(Collectors.<String> toList());
    }

    /**
     * From a given list of Person objects, extract a list of female firstnames
     */
    public static List<String> extractFemaleFirstnames(List<Person> persons) {
	return persons.stream()//
		.filter(p -> p.getGender().equals(Person.Gender.FEMALE))//
		.<String> map(p -> p.getFirstName())//
		.collect(Collectors.<String> toList());
    }

    /**
     * Extract all females older than 18 years from a given list of Person objects.
     */
    public static List<Person> extractAdultWomen(List<Person> persons) {
	return persons.stream()//
		.filter(p -> p.getGender().equals(Person.Gender.FEMALE))//
		.filter((Person p) -> Period.between(p.getBirthDay(), LocalDate.now()).getYears() >= 18)//
		.collect(Collectors.<Person> toList());
    }

    /**
     * From a given list of Person objects, extract a set of firstnames of the people whose lastname starts with the given string.
     */
    public static Set<String> extractFirstnamesWhereLastnameStartsWith(List<Person> persons, String startsWith) {
	return persons.stream()//
		.filter((Person p) -> p.getLastName().startsWith(startsWith))//
		.<String> map(p -> p.getFirstName())//
		.collect(Collectors.<String> toSet());
    }

    /**
     * From a given list of invoices, extract a set of all product names.
     */
    public static Set<String> extractAllProducts(List<Invoice> invoices) {
	return invoices.stream()//
		.<InvoiceItem> flatMap((Invoice i) -> i.getItems().stream())//
		.<String> map((InvoiceItem i) -> i.getProduct())//
		.collect(Collectors.<String> toSet());
    }
}
