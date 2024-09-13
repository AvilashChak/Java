package myJavaPractice;

// import java.util.Scanner; --> way 1 to import
// import java.util.*; // imports all the classes inside the package util --> way 2 to import

public class practice_packages {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in); // --> --> way 3 to import
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}
