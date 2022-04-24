package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("Lina", FEMALE),
            new Person("Mateo", MALE),
            new Person("Santiago", MALE),
            new Person("Camille", FEMALE)
        );

        // Imperative approach
        System.out.println("// Imperative approach");
        List<Person> females = new ArrayList<>();
        for(Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }

        // Declarative approach
        System.out.println("// Declarative approach");

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE,
        FEMALE
    }
}
