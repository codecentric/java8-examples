package de.codecentric.java8examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Utility class that generates some test data for us.
 */
public class TestUtil {

    public static Date dateOf(int month, int day, int year) {
        return new Date(LocalDate.of(year, month, day).toEpochDay());
    }

    public static List<Person> getPersons() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jane", "Jungle", dateOf(12, 15, 1978), Person.Gender.FEMALE));
        list.add(new Person("Mary", "Smith", dateOf(10, 19, 1980), Person.Gender.FEMALE));
        list.add(new Person("John", "Dole", dateOf(5, 31, 1973), Person.Gender.MALE));
        list.add(new Person("Michael", "Abrahams", dateOf(2, 1, 1967), Person.Gender.MALE));
        list.add(new Person("Chris", "Cross", dateOf(8, 22, 1985), Person.Gender.MALE));
        list.add(new Person("Pete", "Power", dateOf(3, 18, 1981), Person.Gender.MALE));
        return list;
    }
}
