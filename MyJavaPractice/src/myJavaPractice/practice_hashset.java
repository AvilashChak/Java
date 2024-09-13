package myJavaPractice;

import java.util.HashSet;

public class practice_hashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(8, 0.5f);
        myHashSet.add(7);
        myHashSet.add(2);
        myHashSet.add(4);
        myHashSet.add(10);
        myHashSet.add(10);
        System.out.println(myHashSet);
    }
}
