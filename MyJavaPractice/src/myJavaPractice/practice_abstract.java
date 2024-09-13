package myJavaPractice;
abstract class Parent1 {
    public Parent1() {
        System.out.println("I'm a constructor of Parent1");
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child1 extends Parent1 {
    public void greet() {
        System.out.println("Hello there!");
    }
    public void greet2() {
        System.out.println("Welcome!");
    }
}
abstract class Child2 extends Parent1 {
    public void th() {
        System.out.println("th");
    }
}
public class practice_abstract {
    public static void main(String[] args) {
        // Parent1 obj = new Parent1();  --> will through error
        Child1 obj = new Child1();
        obj.greet();
        // Child2 objC = new Child2(); --> will through error
    }
}
