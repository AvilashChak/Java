package myJavaPractice;

public class practice_try_catch_block {
    public static void main(String[] args) {
        int a = 5000;
        int b = 0;

        // Without try
        // int c = a/b;
        // System.out.println("The result of C is " + c);

        // With try
        try {
            int c = a/b;
            System.out.println("The result of C is " + c);
        }
        catch (Exception e) {
            System.out.println("The reason for the error is ");
            System.out.println(e);
        }
        System.out.println("End of program..!");
    }
}
