/**
 * Created by niels on 27-09-16.
 */
public class Person {
    public String firstName;
    public static String lastName;

    public Person(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
