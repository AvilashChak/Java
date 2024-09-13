package myJavaPractice;
interface MyCamera2 {
    void takeSnap();
    void recordVideo();
    default void recording4kVideo() {
        System.out.println("Recording in 4k");
    }
}
interface MyWifi2 {
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting..");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2 {
    public void takeSnap() {
        System.out.println("Taking a snap..");
    }
    public void recordVideo() {
        System.out.println("Recording a video.."); // If default method is not modified in class then it will take the default method from the interface
    }
    public void recording4kVideo () {
        System.out.println("Smart Phone's 4k video..");
    }
    public String[] getNetworks() {
        System.out.println("Getting Lists of Networks");
        String[] networkList = {"Airtel", "BSNL", "Jio"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}
public class practice_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // this is a smartPhone but use it as a camera
        // cam1.getNetworks(); --> not allowed
        cam1.recording4kVideo();
    }
}
