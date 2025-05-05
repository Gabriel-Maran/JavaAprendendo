package com.gabrielmaran.aprendendoJUnit.service;

import com.gabrielmaran.aprendendoJUnit.dominio.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {
    public boolean isAdult(Person person) {
//        Objects.requireNonNull(person, "Person can't be null");
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        return person.getAge() >= 18;
    }

    public List<Person> filterRemoveNotAdult(List<Person> persons) {
        return persons.stream().filter(this::isAdult).collect(Collectors.toList());
    }
}
