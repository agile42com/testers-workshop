/**
 * Created by niels on 26-09-16.
 */
public class Person {
    private String firstName;
    private static String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName;
    }
}
