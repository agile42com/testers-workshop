
public class Foo {
    private String string;
    private long number;

    public Foo() {
    }

    public Foo(String string) {
        this.string = string;
    }

    public Foo(long number) {
        this.number = number;
    }

    public void print() {
        System.out.println("String: "+string+"; number: "+number);
    }

    public void methodOne() {
        System.out.println("methodOne");
    }

    public void methodTwo() {
        System.out.println("methodTwo");
    }

    public void methodThree() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }
}

