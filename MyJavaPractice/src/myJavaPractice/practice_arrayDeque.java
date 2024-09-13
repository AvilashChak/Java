package myJavaPractice;

import java.util.ArrayDeque;

public class practice_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.add(9);
        ad1.add(3);
        ad1.addFirst(44);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
