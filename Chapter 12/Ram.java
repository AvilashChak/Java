// package avilash;
import avilash.Nanu;

class Use extends Nanu {
    void meth2() {
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        // System.out.println(a);
    }
}

public class Ram {
    public static void main(String[] args) {
        System.out.println("I am class Ram main method");
        Use c = new Use();
        c.meth2();
        // System.out.println(c.a);
    }
}