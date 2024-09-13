package myJavaPractice;

// 1. Write a program to print "Good Morning" and "Welcome" continuously on the screen in Java using Threads.
// 2. Add a sleep method in Welcome thread of question 1 to delay its execution for 200ms.
// 3. Demonstrate getPriority() and setPriority() methods in Java Threads.
// 4. How do you get state of a given Thread in Java?
// 5. How do you get reference to the current thread in Java?

class Prog1 extends Thread {
    public void run() {
        while(true) {
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning!");
        }
    }
}

class Prog2 extends Thread {
    public void run() {
//        while(true) {
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Welcome!");
//        }
    }
}

public class practice_exercise_8 {
    public static void main(String[] args) {
        Prog1 p1 = new Prog1();
        Prog2 p2 = new Prog2();
        // p1.setPriority(5);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        // p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
