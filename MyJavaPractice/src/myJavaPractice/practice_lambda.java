package myJavaPractice;

interface DemoAno {
  void method1(int a);
  //void method2();
}

/*class AnoyDemo implements DemoAno {
    public void display() {
        System.out.println("Hello");
    }

    @Override
    public void method1() {
        System.out.println("I am method 1");
    }

    @Override
    public void method2() {
        System.out.println("I am method 2");
    }
}*/

public class practice_lambda {
    public static void main(String[] args) {
        /*AnoyDemo obj = new AnoyDemo();
        obj.display();
        obj.method1();
        obj.method2();*/
        // Anonymous class
        /*DemoAno obj = new DemoAno() {
            @Override
            public void method1() {
                System.out.println("Anonymous class method 1");
            }

           *//* @Override
            public void method2() {
                System.out.println("Anonymous class method 2");
            }*//*
        };
        obj.method1();
        //obj.method2();*/

        // Lambda Expression
        DemoAno obj = (a)->{
            System.out.println("I am method 1 from this from this Lambda "+a);
        };
        obj.method1(6);

    }
}
