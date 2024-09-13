package myJavaPractice;
class A {
    public int a;
    public int meth1() {
        return 10;
    }
    public void meth2() {
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A {
    @Override // Override annotation
    public void meth2() {
        System.out.println("I am a method 2 of class B");
    }
    public void meth3() {
        System.out.println("I am a method 3 of class B");
    }
}
public class practice_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
