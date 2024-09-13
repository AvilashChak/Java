package myJavaPractice;

public class practice_finally_block {
    public static int greet() {
        try {
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println("This is the end of the function.");
        }
        return 0;
    }

    public static void main(String[] args) {
        //int k = greet();
        //System.out.println(k);
        int x = 20;
        int y = 4;
        while (true) {
            try {
                System.out.println("Ans:" + x/y);
            }
            catch (Exception e) {
                System.out.println("Exception: " + e);
                break;
            }
            finally {
                System.out.println("I'm finally for value of y = " + y);
            }
            y--;
        }
        try {
            System.out.println(50/0);
        }
        finally {
            System.out.println("Yes this can be done!");
        }
    }
}
