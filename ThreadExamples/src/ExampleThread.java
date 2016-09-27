public class ExampleThread extends Thread {

    private String name;

    public ExampleThread(String name) {
        super();
        this.name = name;
    }

    public void run() {
        System.out.println(String.format("First message from %s", this.name));
        System.out.println(String.format("Second message from %s", this.name));
        System.out.println(String.format("Third message from %s", this.name));
    }

    public static void main(String args[]) {
        (new ExampleThread("first thread")).start();
        (new ExampleThread("second thread")).start();
        (new ExampleThread("third thread")).start();
    }

}
