// Prove that you cannot access default property but can access protected property from the subclass

import avilash.Nanu;

class Using extends Nanu {
    void meth() {
        System.out.println(y);
        // System.out.println(z);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("I am class Problem4 main method");
        Using c = new Using();
        c.meth();
    }
}