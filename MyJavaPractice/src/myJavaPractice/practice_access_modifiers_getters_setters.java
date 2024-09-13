package myJavaPractice;

class MyEmployee {
    private int id;
    private String name;
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String n) {
        name = n;
    }
    public void setId(int i) {
        id = i;
    }
}

public class practice_access_modifiers_getters_setters {
    public static void main(String[] args) {
        MyEmployee nanu;
        nanu = new MyEmployee();
        nanu.setName("Avilash Chakraborty");
        System.out.println(nanu.getName());
        nanu.setId(10);
        System.out.println(nanu.getId());
    }
}
