package myJavaPractice;

import java.util.ArrayList;
import java.util.Scanner;

class MyGeneric<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class practice_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList();
        //arrList.add("String 1");
        arrList.add(67);
        arrList.add(99);
        //arrList.add(new Scanner(System.in));

        //int a = (int) arrList.get(1); this is called type casting - (int)
        int a =  arrList.get(1);
        System.out.println(a);

        MyGeneric<String, Integer> g1 = new MyGeneric(23,"This is just a string", 10);
        String str = g1.getT1();
        System.out.println(str);
        Integer in = g1.getT2();
        System.out.println(in);
    }
}
