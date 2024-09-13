package myJavaPractice;

import java.util.Scanner;

public class practice_specific_exceptions {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 10;
        marks[1] = 15;
        marks[2] = 150;
        marks[3] = 300;
        marks[4] = 900;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e) {
            System.out.println("Some ArithmeticException occurred");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Some ArrayIndexOutOfBoundsException occurred");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred");
            System.out.println(e);
        }
    }
}
