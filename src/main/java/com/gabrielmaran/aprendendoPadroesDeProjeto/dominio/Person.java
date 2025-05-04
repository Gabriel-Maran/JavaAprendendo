package com.gabrielmaran.aprendendoPadroesDeProjeto.dominio;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;

    private Person(String firstMame, String lastMame, String username, String email) {
        this.firstName = firstMame;
        this.lastName = lastMame;
        this.username = username;
        this.email = email;
    }


    public static class PersonBuilder {
        private String firstName; // Campos não são final
        private String lastName;
        private String username;
        private String email;

        private PersonBuilder() {
        }

        // Método estático para criar o builder
        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder username(String username) {
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        // Constrói a Person usando o construtor com parâmetros
        public Person build() {
            return new Person(firstName, lastName, username, email);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstMame='" + firstName + '\'' +
                ", lastMame='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
