package myJavaPractice;
class MyThreadPriority extends Thread {
    MyThreadPriority(String name) {
        super(name);
    }
    public void run() {
        int i = 0;
        while(i<5) {
            System.out.println("Thank you: " + this.getName());
            i++;
        }
    }
}
public class practice_thread_priorities {
    public static void main(String[] args) {
        MyThreadPriority t1 = new MyThreadPriority("Nanu1: min");
        MyThreadPriority t2 = new MyThreadPriority("Nanu2: min");
        MyThreadPriority t3 = new MyThreadPriority("Nanu3: min");
        MyThreadPriority t4 = new MyThreadPriority("Nanu4: norm");
        MyThreadPriority t5 = new MyThreadPriority("Nanu5: max");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
