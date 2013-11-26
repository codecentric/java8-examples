package de.codecentric.java8examples;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Utility class that generates some test data for us.
 */
public class TestData {
    public static List<Person> listOfPersons() {
        return Arrays.asList(
                new Person("Jane", "Jungle", LocalDate.of(1978, 12, 15), Person.Gender.FEMALE),
                new Person("Mary", "Smith", LocalDate.of(1980, 10, 19), Person.Gender.FEMALE),
                new Person("John", "Dole", LocalDate.of(1973, 5, 31), Person.Gender.MALE),
                new Person("Michael", "Abrahams", LocalDate.of(1967, 2, 1), Person.Gender.MALE),
                new Person("Chris", "Cross", LocalDate.of(1985, 8, 22), Person.Gender.MALE),
                new Person("Pete", "Power", LocalDate.of(1981, 3, 18), Person.Gender.MALE),
                new Person("Maggie", "Simpson", LocalDate.of(2012, 10, 18), Person.Gender.FEMALE)
        );
    }

    public static List<Invoice> listOfInvoices() {
        return Arrays.asList(
                new Invoice("Moe", "Homer", Arrays.asList(
                        new InvoiceItem("Beer", 13, BigDecimal.valueOf(1.5)),
                        new InvoiceItem("Burger", 3, BigDecimal.valueOf(4.5)))),
                new Invoice("Crusty Burger", "Homer", Arrays.asList(
                        new InvoiceItem("Burger", 5, BigDecimal.valueOf(5)),
                        new InvoiceItem("Coke", 1, BigDecimal.valueOf(5)))),
                new Invoice("Crusty Burger", "Bart", Arrays.asList(
                        new InvoiceItem("Coke", 1, BigDecimal.valueOf(5)))));
    }
}
