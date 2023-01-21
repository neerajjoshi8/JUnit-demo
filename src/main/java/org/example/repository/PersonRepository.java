package org.example.repository;

import org.example.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private static List<Person> persons = new ArrayList<>();

    private static void init() {
        for (int i = 0; i < 10; i++) {
            Person p = new Person("PERSON-" + i, i + 10);
            persons.add(p);
        }
    }

    public static List<Person> getAllPerson() {
        if (persons.isEmpty()) {
            init();
            System.out.println(persons);
        }
        return persons;
    }
}
