// Create a package in class with three package levels folder, folderL1, folderL2

package folder.folderl1.folderl2;

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

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("I am main method");
        Calculator cal = new Calculator();
        cal.calculate(2, 3);
    }
}