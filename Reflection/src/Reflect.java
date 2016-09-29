import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;

public class Reflect {

    public static void main(String[] args) {

        System.out.println("Get Class name");
        System.out.println("==============");

        Foo foo = new Foo();
        System.out.println("Classname: "+foo.getClass().getName());

        System.out.println("\nCall Random Method");
        System.out.println("==================");

        Method[] methods;
        try {
            methods = foo.getClass().getDeclaredMethods();
            Random random = new Random();
            Method method = methods[random.nextInt(methods.length)];
            System.out.println("Random method call: "+method);
            method.invoke(foo);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        System.out.println("\nGet Constructors");
        System.out.println("================");

        Class<?> c = null;
        try {
            c = Class.forName("Foo");
        } catch (Exception e) {
            e.printStackTrace();
        }


        Constructor<?> cons[] = c.getConstructors();


        System.out.println("\nCall Constructors");
        System.out.println("=================");

        try {
            for (Constructor con : cons) {
                System.out.print("Constructor: " + con.getName() + "[");
                Object[] params = null;
                Class[] types = con.getParameterTypes();
                if (types != null) {
                    params = new Object[types.length];
                    int typeCount = 0;
                    for (Class type : types) {
                        if (typeCount > 0) {
                            System.out.print(", ");
                        }
                        System.out.print(type.getName());
                        switch (type.getName()) {
                            case "long":
                                params[typeCount++] = 12L;
                                break;
                            case "java.lang.String":
                                params[typeCount++] = "ABC";
                                break;
                            default:
                                throw new Exception("UnknownType: "+type.getName());
                        }
                    }
                    System.out.println("]");
                }

                foo = (Foo) con.newInstance(params);
                foo.print();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

