package myJavaPractice;
// 1. Create a class Circle and use inheritance to create another class Cylinder from it.
// 2. Create a class Rectangle and use inheritance to create another class Cuboid. Try to keep it as close to real world scenario as possible.
class Circle1 {
    public int radius;
    Circle1() {
        System.out.println("I'm Circle1 non-parameterized constructor!");
    }
    Circle1(int r){
        System.out.println("I'm Circle1 parameterized constructor!");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder1 extends Circle1 {
    public int height;
    Cylinder1(int r, int h) {
        super(r);
        System.out.println("I'm Cylinder1 parameterized constructor!");
        this.height = h;
    }
    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}
class Rectangle1 {
    public int width;
    public int length;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
//    Rectangle1(int w, int l) {
//        this.width = w;
//        this.length = l;
//    }
    public int area() {
        return width * length;
    }
}
class Cuboid1 extends Rectangle1 {
    public int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
//    Cuboid1(int w, int l, int h) {
//        super(w, l);
//        this.height = h;
//    }
    public int volume() {
        return width * length * height;
    }
}
public class practice_exercise_5 {
    public static void main(String[] args) {
        // Circle1 objC = new Circle1(6);
        // System.out.println(objC.area());
        // Cylinder1 obj = new Cylinder1(2, 5);
        // System.out.println(obj.volume());
        // Rectangle1 objR = new Rectangle1(4,5);
        // System.out.println(objR.area());
        // Cuboid1 obj = new Cuboid1(4,5,2);
        Cuboid1 obj = new Cuboid1();
        obj.setWidth(4);
        obj.setLength(5);
        obj.setHeight(2);

        System.out.println(obj.getLength());
        System.out.println(obj.getWidth());
        System.out.println(obj.getHeight());
        System.out.println(obj.volume());
    }
}
