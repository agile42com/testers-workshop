import java.io.IOException;

/**
 * Created by niels on 26-09-16.
 */
public class Streams {

    public static void main(String[] args) throws IOException {
        System.out.println("This is an output message");
        System.err.println("This is an error message");

        int ch;
        System.out.println("Enter some text: ");
        while ((ch = System.in.read()) != '\n') {
            System.out.print ((char) ch);
        }
    }
}
