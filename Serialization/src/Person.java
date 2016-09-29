/**
 * Created by niels on 26-09-16.
 */
public class Person {
    private String firstName;
    private String lastName;
    private transient int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName+", Age: "+age;
    }
}
