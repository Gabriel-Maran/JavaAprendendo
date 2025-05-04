package com.gabrielmaran.aprendendoJUnit.service;

import com.gabrielmaran.aprendendoJUnit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    @DisplayName("A person should be not adult, when age is lower than eighteen")
    void isAdult_ReturnFalse_WhenAgeIsLowerThanEighteen() {
        Person person = new Person(18);
        PersonService personService = new PersonService();
//        Assertions.assertEquals(true, personService.isAdult(person));
        assertTrue(personService.isAdult(person));
    }
}