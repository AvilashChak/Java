package myJavaPractice;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "Hi I'm toString";
    }

    @Override
    public String getMessage() {
        return "Hi I'm getMessage";
    }
}
public class practice_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a < 100) {
            try {
                // throw new MyException();
                throw new ArithmeticException("This is an arithmetic exception");
            }
            catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
        System.out.println("Yes Finished");

    }
}
