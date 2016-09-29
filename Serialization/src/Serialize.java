import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by niels on 26-09-16.
 */
public class Serialize {

    public static void main(String[] args) {
        Person person = new Person("Harry", "Potter", 13);
        System.out.println("Person:" + person);
        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in person.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}