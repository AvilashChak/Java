package myJavaPractice;

public class practice_set_on_methods {
    // 1. Write a Java method to print multiplication table of a number n
    static void multiplication(int n) {
        for(int i=1; i<=10; i++) {
            // System.out.format("%d x %d = %d\n", n, i, n*i);
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    // 2. Write a program using functions to print the following pattern:
    // *
    // **
    // ***
    // ****
    static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Write a recursive function to calculate sum of first n natural numbers

    // sum(n) = 1 + 2 + 3 ... n
    // sum(n) = 1 + 2 + 3   ... n -1 + n
    // sum(n) = sum(n) + n
    static int sumRecursive(int n) {
        // Base Condition
        if(n == 1) {
            return 1;
        }
        else {
            return n + sumRecursive(n-1);
        }
    }

    // 4. Write a program using functions to print the following pattern:
    // ****
    // ***
    // **
    // *
    static void pattern2(int n) {
        for(int i=0; i<n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Write a function to print nth term of fibonacci series using recursion
    static int fib(int n) {
        /* if(n==1) {
            return 0;
        }
        else if(n==2) {
            return 1;
        } */
        if(n==1 || n==2) {
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    // 6. Write a function to find average of a set of numbers passed as arguments
    static float average(float ...arr) {
        float total = 0;
        float avgResult;
        for(float a: arr) {
            total += a;
        }
        avgResult = total/ arr.length;
        return avgResult;
    }

    // 7. Repeat problem 2 using Recursion
    static void pattern1_recursion(int n) {
        if(n>0) {
            pattern1_recursion(n-1);
            for(int i=0; i<n; i++){
                System.out.print("x");
            }
            System.out.println();
        }
    }

    // 8. Repeat problem 4 using recursion
    static void pattern2_recursion(int n) {
        if(n>0) {
            for(int i=0; i<n; i++) {
                System.out.print("x");
            }
            System.out.println();
            pattern2_recursion(n-1);
        }
    }

    // 9. Write a function to convert Celsius temperature into Fahrenheit
    static float cel_fah(float c) {
        float fah;
        fah = (c*9/5) +32;
        return fah;

    }

    // 10. Repeat problem 3 using iterative method
    static int sumIterative(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Problem 1
        // multiplication(7);

        // Problem 2
        // pattern1(5);

        // Problem 3
        int s = sumRecursive(4);
        // System.out.println(s);

        // Problem 4
        // pattern2(8);

        // Problem 5
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……
        int result = fib(7);
        // System.out.println(result);

        // Problem 6
        float avg = average(4, 6, 11);
        // System.out.println("Average is: " + avg);

        // Problem 7
        // pattern1_recursion(4);

        // Problem 8
        // pattern2_recursion(5);

        // Problem 9
        // System.out.println("The val of Celsius to Fahrenheit is: " + cel_fah(8));

        // Problem 10
        System.out.println(sumIterative(10));

    }
}
