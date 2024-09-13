package myJavaPractice;

class EkClass {
    int a;
    public int getA() {
        return a;
    }
    public EkClass(int a) {
        this.a = a;
    }
}
class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("I'm a DoClass constructor");
    }
}

public class practice_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(10);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
        System.out.println(d.getA());
    }
}
