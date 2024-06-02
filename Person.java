package QuestionOne;/*
 * The Person class represents a person with a name, ID, and birth year. It implements the
 * Comparable interface to allow comparing Person objects based on their birth year (age).
 * It also provides a toString method for a readable representation of the Person object.
 */

public class Person implements Comparable<Person> {
    private String name;
    private int id;
    private int birthYear;

    public Person(String name, int id, int birthYear) {
        this.name = name;
        this.id = id;
        this.birthYear = birthYear;
    }


    @Override
    public int compareTo(Person other) {
        // Compare by age (birthYear)
        return Integer.compare(other.birthYear, this.birthYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birthYear=" + birthYear +
                '}';
    }
}