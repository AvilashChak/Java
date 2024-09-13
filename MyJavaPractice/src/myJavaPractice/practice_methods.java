package myJavaPractice;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class practice_methods {
     int logic (int x, int y) {
        int z;

        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return  z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c;

        practice_methods obj = new practice_methods();
        c = obj.logic(a, b);
        System.out.println(c);
    }
}