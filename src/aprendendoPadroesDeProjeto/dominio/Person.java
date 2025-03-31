package aprendendoPadroesDeProjeto.dominio;

public class Person {
    private final String firstMame;
    private final String lastMame;
    private final String username;
    private final String email;

    private Person(String firstMame, String lastMame, String username, String email) {
        this.firstMame = firstMame;
        this.lastMame = lastMame;
        this.username = username;
        this.email = email;
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastMame;
        private String username;
        private String email;

        public PersonBuilder firstName(String firstMame) {
            this.firstName = firstMame;
            return this;
        }

        public PersonBuilder lastMame(String lastMame) {
            this.lastMame = lastMame;
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

        public Person build() {
            return new Person(firstName, lastMame, username, email);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstMame='" + firstMame + '\'' +
                ", lastMame='" + lastMame + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstMame() {
        return firstMame;
    }

    public String getLastMame() {
        return lastMame;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
