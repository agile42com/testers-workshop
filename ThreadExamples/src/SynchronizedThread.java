public class SynchronizedThread {

    public static synchronized void printSomeMessages(String name) {
        System.out.println(String.format("First message from %s", name));
        System.out.println(String.format("Second message from %s", name));
        System.out.println(String.format("Third message from %s", name));
    }

    public static class MessagePrinter extends Thread {

        private String name;

        public MessagePrinter(String name) {
            super();
            this.name = name;
        }


        public void run() {
            printSomeMessages(this.name);
        }
    }

    public static void main(String args[]) {
        (new MessagePrinter("first thread")).start();
        (new MessagePrinter("second thread")).start();
        (new MessagePrinter("third thread")).start();
    }

}
