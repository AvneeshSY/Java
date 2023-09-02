interface Mycamera2 {
    void takesnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good");
    }

    default void record4kVideo() {
        greet();
        System.out.println("Record 4k");
    }
}

interface Mywifi2 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }

    void pickCall() {

        System.out.println("Connecting...");

    }

}

class MySmartPhone extends MyCellPhone implements Mywifi2, Mycamera2 {
    public void takesnap() {
        System.out.println("take snap");
    }

    public void recordVideo() {
        System.out.println("take smap");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of network ");
        String[] networkList = { "Avneesh", "Harrry", "Anajli" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to" + network);
    }
}

public class Pol {
    public static void main(String[] args) {
        Mycamera2 cam = new MySmartPhone();
        cam.takesnap();
        MyCellPhone cell = new MySmartPhone();
        cell.callNumber(21);
    }
}