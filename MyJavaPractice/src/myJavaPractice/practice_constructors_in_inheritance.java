package myJavaPractice;
class Base {
    Base() {
        System.out.println("I'm a Constructor..!");
    }
    Base(int x) {
        System.out.println("I'm an overloaded constructor with value of x as: " + x);
    }
}
class Derived extends Base {
    Derived() {
        // super(10); // when use super it will take the custom parameter constructor from the Base class
        System.out.println("Im a Derived class constructor..!");
    }
    Derived(int x, int y) {
        super(x);
        System.out.println("I'm an overloaded constructor of Derived class with value of y as: " + y);
    }
}
class ChildDerived extends Derived {
    ChildDerived() {
        System.out.println("I'm a child of Derived class constructor");
    }
    ChildDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I'm an overloaded constructor of ChildDerived class with value of z as: " + z);
    }
}
public class practice_constructors_in_inheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        // Derived d = new Derived();
        // Derived d = new Derived(14,9);
        // ChildDerived cd = new ChildDerived();
        ChildDerived cd = new ChildDerived(8,9,10);
    }
}
