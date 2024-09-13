package myJavaPractice;

import java.util.ArrayList;

public class practice_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(1);
        arr1.add(6);
        arr1.add(5);
        arr1.add(4);
        arr1.add(7);

        arr2.add(12);
        arr2.add(14);
        arr2.add(17);
        arr2.add(19);

        arr1.addAll(arr2);
        for(int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
    }
}
