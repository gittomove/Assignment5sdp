package myBridge;

public class Iphone extends Phone{

    public Iphone() {
        super("Iphone X");
    }

    @Override
    public void useHeadPhones() {
        if(headPhones.Type == "Bluetooth"){
            System.out.println(brand);
            headPhones.test();
        }
        else{
            System.out.println("Not available...");
        }
    }

}
