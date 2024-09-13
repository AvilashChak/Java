package myJavaPractice;
interface sampleInterface {
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface {
    void meth3();
    void meth4();
}
class MySampleInterface implements childSampleInterface {
    public void meth1 () {
        System.out.println("Meth1");
    }
    public void meth2 () {
        System.out.println("Meth2");
    }
    public void meth3 () {
        System.out.println("Meth3");
    }
    public void meth4 () {
        System.out.println("Meth4");
    }
}
public class practice_inheritance_in_interfaces {
    public static void main(String[] args) {
        MySampleInterface msi = new MySampleInterface();
        msi.meth1();
    }
}
