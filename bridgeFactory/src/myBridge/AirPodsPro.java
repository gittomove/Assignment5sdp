package myBridge;

public class AirPodsPro extends HeadPhones{
    public AirPodsPro() {
        super("Bluetooth");
    }

    @Override
    public void test() {
        System.out.println("AirPod Pro are working...");
    }
}
