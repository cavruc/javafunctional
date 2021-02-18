package src.main.java.optional;

import java.util.List;
import java.util.stream.Collectors;

public class self_Program {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Vera", "Germany", 35, Gender.FEMALE),
                new Person("Vera", "Moldova", 37, Gender.FEMALE),
                new Person("Igor", "Germany", 42, Gender.MALE),
                new Person("Ion", "Italy", 25, Gender.MALE),
                new Person("Kiril", "France", 46, Gender.PREFER_NOT_TO_SAY),
                new Person("Dario", "Germany", 35, Gender.FEMALE),
                new Person("Valea", "Belgic", 37, Gender.FEMALE)
        );
        people.forEach(System.out::println);

        people.stream()
                .map(person -> person.gender)//functie
                .collect(Collectors.toSet()) // face set
                .forEach(x -> System.out.println(x));

        people.stream()
                .map(person -> person.name.length())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .filter(person -> person.age > 30)
                .forEach(person -> System.out.println(person.name + " " + person.country));

        people.stream()
                .filter(person -> person.name.equals("Kiril"))
                .forEach(person -> System.out.println(person));
    }


    static class Person {
        private String name;
        private String country;
        private int age;
        private Gender gender;

        public Person(String name, String country, int age, Gender gender) {
            this.name = name;
            this.country = country;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        FEMALE, MALE, PREFER_NOT_TO_SAY
    }

}
