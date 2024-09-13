package myJavaPractice;
class MyThr1 extends Thread {
    int i = 0;
    public void run() {
        while(true) {
            System.out.println("Thread 1");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyThr2 extends Thread {
    int i = 0;
    public void run() {
        while(i<20) {
            System.out.println("Thread 2");
            i++;
        }
    }
}
public class practice_thread_methods {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();
        t1.start();
        /*try {
            t1.join();
        }
        catch(Exception e) {
            System.out.println(e);
        }*/
        t2.start();
    }
}
