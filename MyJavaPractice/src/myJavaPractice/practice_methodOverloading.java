package myJavaPractice;

public class practice_methodOverloading {
    static void foo() {
        System.out.println("Good Morning..! How are you..!");
    }

    static void foo(String a) {
        System.out.println("Good Morning " + a + " ..! How are you..!");
    }

    //example of parameters

    static void foo(String a, int b) {
        System.out.println("Good Morning " + a + " ..! No: " + b + " How are you doing?");
    }

    static void change(int x) {
        x = 99;
    }

    static void changeArr(int [] arr) {
        arr[0] = 10;
    }

    static void randomMessage() {
        System.out.println("Hey there..!");
    }

    public static void main(String[] args) {
        // randomMessage();

        // Case 1: Changing Integer
        int a = 77;
        change(a);
        System.out.println("The value of x after running change is: " + a);

        // Case 2: Changing Integer in Array
        int [] marks = { 56, 78, 87, 98, 94 };
        changeArr(marks);
        System.out.println("The value of arr[0] after running change is: " + marks[0]);

        // Method Overloading
        foo();
        foo("Avilash");
        foo("Avishek", 10); // example of argument

        // Arguments are actual
    }
}
