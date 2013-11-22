package de.codecentric.java8examples;

import java.util.Calendar;
import java.util.Date;

/**
 * A simple class that represents a person
 */
public class Person {

    public enum Gender {
        MALE, FEMALE
    }

    private final String name;
    private final String lastName;
    private final Date birthDay;
    private Gender gender;

    public Person(String name, String lastName, Date birthDay, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        Calendar now = Calendar.getInstance();
        Calendar birth = Calendar.getInstance();
        birth.setTime(getBirthDay());

        int years = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        if(now.get(Calendar.MONTH) > birth.get(Calendar.MONTH) ||
                now.get(Calendar.MONTH) == birth.get(Calendar.MONTH) && birth.get(Calendar.DATE) > now.get(Calendar.DATE)) {
            years--;
        }

        return years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (birthDay != null ? !birthDay.equals(person.birthDay) : person.birthDay != null) return false;
        if (gender != person.gender) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDay != null ? birthDay.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", gender=" + gender +
                '}';
    }
}
