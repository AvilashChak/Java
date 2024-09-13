package myJavaPractice;
@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
    //void thisMethod2();
}

class NewPhone extends Phone {
    @Override
    public void showTime() {
        System.out.println("Time is 8pm");
    }
    @Deprecated
    public int sum(int a, int b) {
        return a+b;
    }
}

public class practice_annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.showTime();
        newPhone.sum(5,6);
    }
}
