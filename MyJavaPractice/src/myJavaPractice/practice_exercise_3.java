package myJavaPractice;

// 1. Create a class Cylinder and use getters and setters to set its radius and height
// 2. Use 1 to calculate surface area and volume of the Cylinder
// 3. Use a constructor and repeat 1
// 4. Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
// 5. Repeat 1 for a sphere

class Cylinder {
    private int height;
    private int radius;
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int h) {
        this.height = h;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int r) {
        this.radius = r;
    }
    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class MyRectangle {
    private int length;
    private int breadth;
    public MyRectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}

class Sphere {
    private int radius;
    public Sphere() {
        this.radius = 5;
    }
    public Sphere(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    public double diameter() {
        return 2 * radius;
    }
    public double volume() {
        return (4.0 / 3.0) * Math.PI * ( radius * radius * radius);
    }
}

public class practice_exercise_3 {
    public static void main(String[] args) {
        /*
        // Problem 1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(20);
        myCylinder.setRadius(10);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */
        /*
        // Problem 3
        Cylinder newCylinder = new Cylinder(9,12); // Using constructor. Here we do not need to use setters
        System.out.println(newCylinder.getRadius());
        System.out.println(newCylinder.getHeight());
        System.out.println(newCylinder.surfaceArea());
        System.out.println(newCylinder.volume());
         */
        /*
        // Problem 4
        MyRectangle rect = new MyRectangle();
        //MyRectangle rect = new MyRectangle(10,6); // using custom parameters
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
         */
        // Problem 5
        Sphere s = new Sphere(6);
        System.out.println(s.surfaceArea());
        System.out.println(s.diameter());
        System.out.println(s.volume());

    }
}
