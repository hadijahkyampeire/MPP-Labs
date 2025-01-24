package prob1.partE.classInterface;

public class D implements B, C{

    @Override
    public void method() {
        B.super.method(); // B is forced to choose which one to implement
    }
}
