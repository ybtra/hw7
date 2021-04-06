package academy.belhard;

import java.util.Objects;

final public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;

    public Person(String firstName, String lastName, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    final public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
               Objects.equals(lastName, person.lastName) &&
               gender == person.gender;
    }

    @Override
    final public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }

    @Override
    final public String toString() {
        return "Person{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", gender = " + gender +
                '}';
    }
}