package myJavaPractice;

class Employee1{
    int id;
    String name;
    int salary;
    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary() {
        return salary;
    }
}

public class practice_custom_class {

    public static void main(String[] args) {
        System.out.println("This is our custom class!");
        Employee1 avilash = new Employee1(); // Instantiating a new myJavaPractice.Employee Object
        Employee1 avishek = new Employee1();

        // Setting Attributes for Avilash
        avilash.id = 8;
        avilash.name = "Avilash Chakraborty";
        avilash.salary = 55;

        // Setting Attributes for Avishek
        avishek.id = 10;
        avishek.name = "Avishek Chakraborty";
        avishek.salary = 100;

        // Printing the Attributes
        // System.out.println(avilash.id);
        // System.out.println(avilash.name);
        avilash.printDetails();
        int avilashSalary = avilash.getSalary();
        System.out.println(avilashSalary);;

        avishek.printDetails();
        System.out.println(avishek.getSalary());;
    }
}
