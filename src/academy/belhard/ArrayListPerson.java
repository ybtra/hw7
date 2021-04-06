package academy.belhard;

import java.util.List;

public class ArrayListPerson {
    public static void main(String[] args) {
        Person person1 = new Person("firstName1", "lastName1", Gender.MALE);
        Person person2 = new Person("firstName2", "lastName2", Gender.FEMALE);
        Person person3 = new Person("firstName3", "lastName3", Gender.MALE);
        Person person4 = new Person("firstName4", "lastName4", Gender.FEMALE);
        Person person5 = new Person("firstName5", "lastName5", Gender.MALE);

        java.util.ArrayList<Person> persons = new java.util.ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        outputList(persons);
        System.out.print("Количество элементов: " + persons.size());
    }

    public static void outputList(List<Person> list) {
        System.out.println();
        for (Person persons : list) {
            System.out.print(persons + " ");
            System.out.println();
        }
    }
}
