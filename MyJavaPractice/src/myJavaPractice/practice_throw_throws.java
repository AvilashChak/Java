package myJavaPractice;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class practice_throw_throws {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result;
        result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        // Created by Nanu
        int result;
        result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Ram ---> uses function created by Nanu
        try {
//            int c;
//            c = divide(5,0);
//            System.out.println("Ans: " + c);
            double ar;
            ar = area(-2);
            System.out.println(ar);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
