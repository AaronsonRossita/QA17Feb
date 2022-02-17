package package1;

public class Class1 {

    public int publicInt;
    protected int protectedInt;
    private int privateInt;

    public Class1(int publicInt, int protectedInt, int privateInt) {
        this.publicInt = publicInt;
        this.protectedInt = protectedInt;
        this.privateInt = privateInt;
    }

    public int getPrivateInt() {
        return privateInt;
    }

    public void setPrivateInt(int privateInt) {
        this.privateInt = privateInt;
    }
}
