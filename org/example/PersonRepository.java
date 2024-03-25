package org.example;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {

    Map<String, Person> persons = Map.of("1", new Person("1", "Lacher", DaysOfWeek.MONDAY));;

    public PersonRepository(Map<String, Person> persons) {
        this.persons = persons;
    }

    public PersonRepository() {
    }

    public Optional<Person> findPersonById(String id) {
        return Optional.ofNullable(persons.get(id));
    }
}
