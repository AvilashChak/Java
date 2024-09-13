// Create three classes Calculator, ScCalculator and HybCalculator and group them into a calc package

package calc;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + (a+b));
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + Math.sin(a+b));
    }
}

class HybCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + (a+b));
        System.out.println("Your result is: " + Math.sin(a+b));
    }
}

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("I am main method");
        Calculator cal = new Calculator();
        cal.calculate(2, 3);
    }
}