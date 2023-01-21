package org.example;

import org.example.entity.Person;
import org.example.repository.PersonRepository;

import java.util.List;

public class Operation {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public boolean isNumber(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public Person findPersonWithAge(int age) {
        List<Person> persons = PersonRepository.getAllPerson();
        for (Person person : persons) {
            if (person.getAge() == age) {
                return person;
            }
        }
        return null;
    }
}
