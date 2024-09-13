package myJavaPractice;

class MyMainEmployee {
    private int id;
    private String name;

    /*
    public myJavaPractice.MyMainEmployee() {
        id = 11;
        name = "Avishek";
    }
    */

    public MyMainEmployee(int myId, String myName) {
        id = myId;
        name = myName;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int i) {
        this.id = i;
    }
    public void setName(String n) {
        this.name = n;
    }
}

public class practice_constructors {
    public static void main(String[] args) {
        MyMainEmployee nanu = new MyMainEmployee(20, "Beckham");
        // nanu.setId(10);
        // nanu.setName("Avilash");
        System.out.println(nanu.getId());
        System.out.println(nanu.getName());
    }

}
