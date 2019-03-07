package ch05;

import java.util.Objects;

public class Person1 {
    private String name;
    private int j;

    public Person1(String name, int j) {
        this.name = name;
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return j == person1.j &&
                Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, j);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", j=" + j +
                '}';
    }
}


