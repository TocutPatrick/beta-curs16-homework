package org.beta.curs16.homework;

import java.sql.SQLOutput;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonService service = new PersonService();

        service.add(new Person("Del", "Mihai", 44, "Oradea"));
        service.add(new Person("Berce", "Denis", 45, "Cluj"));
        service.add(new Person("Pop", "Maria", 23, "Oradea"));
        service.add(new Person("Pop", "Viorel", 67, "Cluj"));
        service.add(new Person("Mihail", "Aurica", 30, "Craiova"));
        service.add(new Person("Popescu", "George", 12, "Bucuresti"));

        System.out.println("Names list: ");
        System.out.println(service.printNames());

        System.out.println("Major persons: ");
        System.out.println(service.listMajorPersons());

        System.out.println("Persons from Oradea: ");
        System.out.println(service.listPersonsFromOradea());

        System.out.println("Persons from Oradea or Cluj: ");
        System.out.println(service.listPersonsFromOradeaOrCluj());

        System.out.println("First names capitalized: ");
        System.out.println(service.listFirstNamesCapitalized());

        System.out.println("Shorted names: ");
        System.out.println(service.listShortedNames());

        System.out.println("Persons between 18 and 60: ");
        System.out.println(service.listPersonsBetween18And60());

        System.out.println("Last names starting with A: ");
        System.out.println(service.listLastNamesStartingWithA());

        System.out.println("List first names uniquely: ");
        System.out.println(service.listAllUniqueFirstNames());

        System.out.println("Sorted by first name: ");
        System.out.println(service.sortByFirstName());

        System.out.println("Sorted by last name: ");
        System.out.println(service.sortByLastName());

        System.out.println("Sorted bu first name, last name then age: ");
        System.out.println(service.sortByFirstNameLastNameAndAge());
    }
}
