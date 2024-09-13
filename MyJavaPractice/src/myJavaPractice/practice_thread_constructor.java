package myJavaPractice;
class MyThr extends Thread {
    MyThr(String name) {
        super(name);
    }
    int i = 0;
    public void run() {
        while(i<10) {
            System.out.println("My thread is running..");
            i++;
        }
    }
}
public class practice_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Ram");
        MyThr t2 = new MyThr("Nanu");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getId());
        System.out.println(t2.getName());
    }
}
