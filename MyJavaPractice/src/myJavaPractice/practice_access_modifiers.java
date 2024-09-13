package myJavaPractice;
class C1 {
    public int x = 10;
    protected int y = 11;
    int z = 8;
    private int a = 7;
    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class practice_access_modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); --> cannot be used in same package as it has used private access modifier

    }
}
