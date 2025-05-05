package com.gabrielmaran.aprendendoJUnit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChildType(){
        Employee employeeDeveloper = new Developer("1", "Java");
//        if(employeeDeveloper instanceof Employee){ // Metodo antigo
//            Developer developer = (Developer) employeeDeveloper;
//            Assertions.assertEquals("Java", developer.getMainLanguage());
//        }

        if(employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }

}