package myBridge;

public class Test {
    public static void main(String[] args) {

        Phone phone = new Nokia();
        HeadPhones headPhones = new JBL_T110();

        phone.setHeadPhones(headPhones);
        phone.useHeadPhones();
    }
}
