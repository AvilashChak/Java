package myJavaPractice;

import java.util.Scanner;

public class practice_exercise_9 {
    public static void main(String[] args) {
        // Problem 1
        // Syntax error int a = 7
        int age = 78;
        int year_born = 2000 - 78; // Logical error
        // System.out.println(6/0);

        // Problem 2
        try {
            int a = 666/0 ;
        }
        catch (IllegalArgumentException e) {
            System.out.println("haha");
        }
        catch (ArithmeticException e) {
            System.out.println("hihi");
        }

        // Problem 3
        // Write a program that allows you to keep accessing an array until a valid index is given. If max reties exceed 5 print "Error"

        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 11;
        marks[2] = 12;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i < 5) {
            try {
                System.out.println("Enter the value of index!");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
            if (i >= 5) {
                System.out.println("Error max retry reached");
            }
        }

    }
}
