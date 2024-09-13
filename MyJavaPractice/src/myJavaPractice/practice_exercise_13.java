package myJavaPractice;

// 1. Create javadoc from a java program using and without using Intellij Idea
// 2. Created a class and add a method with deprecated annotation. What is its effect on program execution
// 3. Suppress the generated warning from 2
// 4. Create an interface and generate an instance from it
// 5. Write a program to generate multiplication table of a given number and write it to a file
// 6. Repeat 5 from numbers 2-9 and save all these multiplication tables to a folder

import java.io.FileWriter;
import java.io.IOException;

// 2.
class MyDeprecated {
    @Deprecated
    void method1() {
        System.out.println("This is method 1");
    }
}
// 4.
interface MyInt {
    void display();
}
public class practice_exercise_13 {
    public static void main(String[] args) {
        /*MyDeprecated md = new MyDeprecated();
        md.method1();

        MyInt m = new MyInt() {
            @Override
            public void display() {
                System.out.println("I am display!");
            }
        };
        m.display();

        MyInt ml = () -> {
            System.out.println("I am Lambda Display");
        };
        ml.display();*/

        int i = 17;
        String table = "";
        for(int j = 0; j < 10; j++) {
            table += i + "x" + (j + 1) + "=" + i*(j+1);
            table += "\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("Mul.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


