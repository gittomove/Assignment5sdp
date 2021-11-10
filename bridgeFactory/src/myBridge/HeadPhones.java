package myBridge;

public abstract class HeadPhones {
    protected String Type;

    public HeadPhones(String type) {
        Type = type;
    }

    abstract void test();
}
