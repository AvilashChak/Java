package myJavaPractice;
class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while(i<300) {
            System.out.println("Hi I'm cooking..");
            System.out.println("Smelling good..");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while(i<300) {
            System.out.println("I am chatting..");
            System.out.println("Everyone is happy..");
            i++;
        }
    }
}
public class practice_threads {
    public static void main(String[] args) {
        MyThread1 my1 = new MyThread1();
        MyThread2 my2 = new MyThread2();
        my1.start();
        my2.start();
    }
}
