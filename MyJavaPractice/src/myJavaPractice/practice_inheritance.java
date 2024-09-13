package myJavaPractice;

import java.sql.SQLOutput;

// Concept of Inheritance
class Parent { // also can be called as Base, SuperClass
    public int x;
    public Parent() {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("X is set from Parent Class");
        this.x = x;
    }
}
class Child extends Parent { // also can be called as Derived, SubClass
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class practice_inheritance {
    public static void main(String[] args) {
        // Creating an object of Parent class
        Parent p = new Parent();
        p.setX(5);
        System.out.println(p.getX());

        // Creating an object of Child class
        Child c = new Child();
        c.setX(6);
        System.out.println(c.getX());
    }
}
