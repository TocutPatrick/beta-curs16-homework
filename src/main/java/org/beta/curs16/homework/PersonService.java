package org.beta.curs16.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonService {
    private List<Person> personList;

    public PersonService() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public List<String> printNames() {
        return personList.stream()
                .map(person -> person.firstName() + " " + person.lastName())
                .toList();
    }

    public List<Person> listMajorPersons() {
        return personList.stream()
                .filter(person -> person.age() >= 18)
                .toList();
    }

    public List<Person> listPersonsFromOradea() {
        return personList.stream()
                .filter(person -> person.city().equalsIgnoreCase("Oradea"))
                .toList();
    }

    public List<Person> listPersonsFromOradeaOrCluj() {
        return personList.stream()
                .filter(person -> person.city().equalsIgnoreCase("Oradea") || person.city().equalsIgnoreCase("Cluj"))
                .toList();
    }

    public List<String> listFirstNamesCapitalized() {
        return personList.stream()
                .map(person -> person.firstName().toUpperCase())
                .toList();
    }

    public List<String> listShortedNames() {
        return personList.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0) + ".")
                .toList();
    }

    public List<Person> listPersonsBetween18And60(){
        return personList.stream()
                .filter(person -> person.age() > 18 && person.age() < 60)
                .toList();
    }

    public List<Person> listLastNamesStartingWithA(){
        return personList.stream()
                .filter(person -> person.lastName().charAt(0) == 'A')
                .toList();
    }

    public List<String> listAllUniqueFirstNames(){
        return personList.stream()
                .map(Person::firstName)
                .distinct()
                .toList();
    }

    public List<Person> sortByFirstName(){
        return personList.stream()
                .sorted(Comparator.comparing(Person::firstName))
                .toList();

    }

    public List<Person> sortByLastName(){
        return personList.stream()
                .sorted(Comparator.comparing(Person::lastName))
                .toList();

    }

    public List<Person> sortByFirstNameLastNameAndAge(){
        return personList.stream()
                .sorted(Comparator.comparing(Person::firstName)
                        .thenComparing(Person::lastName)
                        .thenComparing(Person::age))
                .toList();
    }
}
