package reflect;

public class Foo {
    String string;

    public Foo(){ }

    public Foo(String str){
        this.string = str;
    }

    public void print(){
        System.out.println(string);
    }
}

