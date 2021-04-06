package academy.belhard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapPerson {
    public static void main(String[] args) {
        Person person1 = new Person("firstName1", "lastName1", Gender.MALE);
        Person person2 = new Person("firstName2", "lastName2", Gender.FEMALE);
        Person person3 = new Person("firstName3", "lastName3", Gender.MALE);
        Person person4 = new Person("firstName4", "lastName4", Gender.FEMALE);
        Person person5 = new Person("firstName5", "lastName5", Gender.MALE);

        Map<Person, Integer> persons = new HashMap<>();

        persons.put(person1, 1);
        persons.put(person2, 2);
        persons.put(person3, 3);
        persons.put(person4, 4);
        persons.put(person5, 5);

        outputCollection(persons);
        System.out.print("Количество элементов: " + persons.size());
    }

    public static void outputCollection(Map<Person, Integer> map) {
        System.out.println("Вывод: ");

        for (Map.Entry<Person, Integer> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }

        System.out.println();
    }
}
