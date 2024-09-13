// Use a built-in package in Java to write a class which displays a message (by using sout) after taking input from the user

package prob2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Type your roll no");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Hi Avilash your roll no is " + a);
    }
}