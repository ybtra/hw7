package academy.belhard;

import java.util.HashSet;
import java.util.Set;

public class HashSetPerson {
    public static void main(String[] args) {
        Person person1 = new Person("firstName1", "lastName1", Gender.MALE);
        Person person2 = new Person("firstName1", "lastName1", Gender.MALE);
        Person person3 = new Person("firstName2", "lastName2", Gender.FEMALE);
        Person person4 = new Person("firstName2", "lastName2", Gender.FEMALE);
        Person person5 = new Person("firstName3", "lastName3", Gender.MALE);

        Set<Person> persons = new HashSet<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        outputCollection(persons);
        System.out.print("Количество элементов: " + persons.size());
    }

    public static void outputCollection(Set<Person> set) {
        System.out.println("Вывод: ");

        for (Person number : set) {
            System.out.println(number + " ");
        }

        System.out.println();
    }
}
