package myJavaPractice;

// 1. Create a ArrayList and store names of 10 students inside it. Print it using a for each loop.
// 2. Use the date class in Java to print time in the following format : 21:47:02
// 3. Repeat 2 using Calendar class
// 4. Repeat 2 using java.Time API
// 5. Create a Set in Java. Try to store duplicate elements inside this Set and verify that only one instance is stored.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class practice_exercise_11 {
    public static void main(String[] args) {
        // 1 :
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Student 1");
        arr.add("Student 2");
        arr.add("Student 3");
        arr.add("Student 4");
        arr.add("Student 5");
        arr.add("Student 6");
        arr.add("Student 7");
        arr.add("Student 8");
        arr.add("Student 9");
        arr.add("Student 10");

        for (Object o: arr) {
            System.out.println(o);
        }

        // 2 :
        Date d = new Date();
        System.out.println("By Date class: "+ d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // 3 :
        Calendar c = Calendar.getInstance();
        System.out.println("By Calendar class: "+ c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        // 4 :
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println("By Java Time Api: "+ myDate);

        // 5 :
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(10);
        s.add(12);
        s.add(7);
        s.add(10);
        System.out.println(s);

    }
}


