package myBridge;

public class Samsung extends Phone{

    public Samsung() {
        super("Samsung A10");
    }

    @Override
    public void useHeadPhones() {
        if(headPhones.Type == "Bluetooth" || headPhones.Type == "Wire"){
            System.out.println(brand);
            headPhones.test();
        }
        else{
            System.out.println("Not available...");
        }
    }
}
