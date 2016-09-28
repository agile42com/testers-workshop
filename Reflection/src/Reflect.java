import reflect.Foo;

import java.lang.reflect.Constructor;

/**
 * Created by niels on 28-09-16.
 */
public class Reflect {

    public static void main(String[] args) {

        //create instance of "Class"
        Class<?> c = null;
        try {
            c = Class.forName("reflect.Foo");
        } catch (Exception e) {
            e.printStackTrace();
        }


        //create instance of "Foo"
        Foo f1 = null;
        Foo f2 = null;

        //get all constructors
        Constructor<?> cons[] = c.getConstructors();

        try {

            f1 = (Foo) cons[0].newInstance();
            f2 = (Foo) cons[1].newInstance("abc");
        } catch (Exception e) {
            e.printStackTrace();
        }

        f1.print();
        f2.print();

    }
}
