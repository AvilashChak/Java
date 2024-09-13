package myJavaPractice;

import java.util.LinkedList;

public class practice_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addFirst(233);
        list1.add(23);
        list1.add(33);
        list1.add(63);
        list1.add(89);
        list1.addLast(890);

        for(Integer i: list1) {
            System.out.print(i);
            System.out.print(',');
        }
    }
}
