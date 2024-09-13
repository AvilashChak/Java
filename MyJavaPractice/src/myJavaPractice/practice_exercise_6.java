package myJavaPractice;

// 1. Create an abstract class Pen with methods write() and refill() as abstract methods
// 2. Use the Pen class from Q1 to create a concrete class FountainPen with additional method changeNib()
// 3. Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep() methods.
abstract class Pen {
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen {
    public void write() {
        System.out.println("Writing..");
    };
    public void refill() {
        System.out.println("Refilling..");
    }
    public void changeNib() {
        System.out.println("Changing the nib..");
    }
}
class Monkey {
    void jump() {
        System.out.println("Jump");
    }
    void bite() {
        System.out.println("Bite");
    }
}
interface BasicAnimal {
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal {
    public void speak() {
        System.out.println("Hello Sir");
    }
    public void eat() {
        System.out.println("Eat");
    }
    public void sleep() {
        System.out.println("Sleep");
    }
}

public class practice_exercise_6 {
    public static void main(String[] args) {
        // Q1 + 2
        FountainPen pen = new FountainPen();
        pen.changeNib();
        // Q3
        Human nanu = new Human();
        nanu.eat();

        // Q5
        Monkey m1 = new Human();
        m1.jump();
        // m1.speak(); --> cannot use speak method because the reference is Monkey which doesn't have speak method
        BasicAnimal hippo = new Human();
        // hippo.speak(); --> error
        hippo.eat();
    }
}
