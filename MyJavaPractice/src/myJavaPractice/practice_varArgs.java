package myJavaPractice;

public class practice_varArgs {
    static int sum(int a, int b) {
        return a+b;
    }
    static int sum(int a, int b, int c) {
        return a+b+c;
    }

    // and so on. Here we are using method overloading but now in this practice set we will learn varArgs

    static int sum(int x,int ...arr) {
        // Available as int [] arr
        int result = x;
        for(int a: arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varArgs ..");
        // System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of nothing is: " + sum(1));
        System.out.println("The sum of 3 and 4 is: " + sum(3,4));
        System.out.println("The sum of 3, 4 and 5 is: " + sum(3,4, 5));
        System.out.println("The sum of 3, 4 and 5 is: " + sum(3, 4, 5, 6));
        System.out.println("The sum of 3, 4, 5, 6, 7 is: " + sum(3, 4, 5, 6, 7));
    }
}
