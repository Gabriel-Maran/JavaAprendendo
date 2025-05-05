package com.gabrielmaran.aprendendoJUnit.service;

import com.gabrielmaran.aprendendoJUnit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult, when age is lower than eighteen")
    void isAdult_ReturnFalse_WhenAgeIsLowerThanEighteen() {
//        Assertions.assertEquals(false, personService.isAdult(person));
        assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be an adult, when age is greater or equal than eighteen")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThanEighteen() {
//        Assertions.assertEquals(true, personService.isAdult(person));
        assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ShouldThrowException_WhenPersonIsNull() {
//        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null), "Person can't be null");
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> personService.isAdult(null), "Person cannot be null");
    }

    @Test
    @DisplayName("Should return a list with only adults")
    void filterRemoveNotAdult_ReturnListWithAdultOnly_WhenListofPersonWithAdultIsPassed() {
        Person person1 = new Person(18);
        Person person2 = new Person(21);
        Person person3 = new Person(15);
        List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filterRemoveNotAdult(personList).size());
    }
}