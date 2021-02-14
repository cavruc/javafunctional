package optional;

import java.util.Locale;
import java.util.Optional;

public class _exemple_Optional {
    public static void main(String[] args) {
        Person person = new Person("James", null);
        System.out.println(person.getEmail().map(String::toLowerCase));
    }
}
class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email) ;
    }
}
