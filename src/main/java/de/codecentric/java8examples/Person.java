package de.codecentric.java8examples;

import java.time.LocalDate;
import java.time.Period;

/**
 * A simple class that represents a person
 */
public class Person {

    public enum Gender {
        MALE, FEMALE
    }

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDay;
    private Gender gender;

    public Person(String firstname, String lastName, LocalDate birthDay, Gender gender) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return Period.between(getBirthDay(), LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (birthDay != null ? !birthDay.equals(person.birthDay) : person.birthDay != null) return false;
        if (gender != person.gender) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDay != null ? birthDay.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", gender=" + gender +
                '}';
    }
}
