package myBridge;

public class Nokia extends Phone{
    public Nokia() {
        super("Nokia 3310");
    }

    @Override
    public void useHeadPhones() {
        if(headPhones.Type == "Wire"){
            System.out.println(brand);
            headPhones.test();
        }
        else{
            System.out.println("Not available...");
        }
    }

}
