package myBridge;

public abstract class Phone {
    abstract public void useHeadPhones();

    protected String brand;
    protected HeadPhones headPhones;

    public Phone(String brand) {
        this.brand = brand;
    }

    public void setHeadPhones(HeadPhones headPhones) {
        this.headPhones = headPhones;
    }
}
