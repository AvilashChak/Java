package myJavaPractice;
interface Bicycle {
    int a = 45;
    void speedUp(int increment);
    void applyBrake(int decrement);
}
interface BicycleHorn {
    void blowHornA();
    void blowHornB();
}
class Hero implements Bicycle, BicycleHorn {
    public int speed = 10;
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println(speed);
    }
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println(speed);
    }
    public void blowHornA() {
        System.out.println("Horn A");
    }
    public void blowHornB() {
        System.out.println("Horn B");
    }
}

public class practice_interfaces {
    public static void main(String[] args) {
        Hero obj = new Hero();
        obj.speedUp(10);
        obj.applyBrake(5);
        System.out.println(obj.a); // You can create properties in interfaces
        // obj.a = 56; --> You cannot modify the value of properties in interfaces as they are final

        obj.blowHornA();
        obj.blowHornB();
    }
}
