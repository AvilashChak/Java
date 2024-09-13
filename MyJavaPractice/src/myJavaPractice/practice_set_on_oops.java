package myJavaPractice;// 1. Create a class myJavaPractice.Employee with the following properties and methods :
// - salary (property) (int)
// - getSalary (method returning int)
// - name (property) (String)
// - getName (method returning String)
// - setName (method changing String)

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

}

// 2. Create a class cellphone with methods to print "ringing...", "vibrating...", etc

class Cellphone {
    public void ring() {
        System.out.println("Ringing..");
    }
    public void vibrate() {
        System.out.println("Vibrating..");
    }
    public void callFriend() {
        System.out.println("Calling Avishek..");
    }
}

// 3. Create a class myJavaPractice.Square with a method to initialize its side, calculating area, perimeter etc

class Square {
    int side;
    public int area() {
        return side*side;
    }
    public int perimeter() {
        return 4*side;
    }
}

// 4. Create a class myJavaPractice.Rectangle and repeat 3

class Rectangle {
    int width;
    int length;
    int peri;
    public int area() {
        return width*length;
    }
    public int perimeter() {
        peri = 2*(width+length);
        return peri;
    }
}

// 5. Create a class myJavaPractice.TommyVecetti for Rockstar Games capable of hitting (print hitting...), running, firing etc.

class TommyVecetti {
    public void hit() {
        System.out.println("Hitting the enemy...");
    }
    public void run() {
        System.out.println("Running from the enemy...");
    }
    public void fire() {
        System.out.println("Firing on the enemy...");
    }
}

// 6. Repeat 4 for a myJavaPractice.Circle

class Circle {
    float pi = 3.14159f;
    float r;
    public float area() {
        return pi*(r*r);
    }
    public float perimeter() {
        return 2*pi*r;
    }
}

public class practice_set_on_oops {
    public static void main(String[] args) {
        /*
        // Problem 1
        myJavaPractice.Employee avilash = new myJavaPractice.Employee();
        avilash.setName("Avilash Chakraborty");
        avilash.salary = 55;
        System.out.println(avilash.getName());
        System.out.println(avilash.getSalary());

        // Problem 2
        myJavaPractice.Cellphone iphone = new myJavaPractice.Cellphone();
        iphone.ring();
        iphone.vibrate();
        iphone.callFriend();

        // Problem 3
        myJavaPractice.Square sq = new myJavaPractice.Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Problem 4
        myJavaPractice.Rectangle rect = new myJavaPractice.Rectangle();
        rect.width = 4;
        rect.length = 5;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());

        // Problem 5
        myJavaPractice.TommyVecetti player1 = new myJavaPractice.TommyVecetti();
        player1.hit();
        player1.run();
        player1.fire();
         */

        // Problem 6
        Circle circle = new Circle();
        circle.r = 3f;
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

    }
}
