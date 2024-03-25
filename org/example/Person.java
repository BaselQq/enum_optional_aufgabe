package org.example;

import java.util.Objects;

public record Person(String id, String name, DaysOfWeek favoriteDay) {

    public Person {
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && favoriteDay == person.favoriteDay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, favoriteDay);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", favoriteDay=" + favoriteDay +
                '}';
    }
}
