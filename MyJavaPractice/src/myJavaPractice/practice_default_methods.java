package myJavaPractice;
interface MyCamera {
    void takeSnap();
    void recordVideo();
    default void recording4kVideo() {
        System.out.println("Recording in 4k");
    }
}
interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting..");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
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

public class practice_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.recording4kVideo();
        ms.takeSnap();
        String[] arr = ms.getNetworks();
        for(String item: arr) {
            System.out.println(item);
        }

    }
}
