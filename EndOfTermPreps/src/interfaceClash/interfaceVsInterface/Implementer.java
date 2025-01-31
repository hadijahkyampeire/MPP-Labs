package interfaceClash.interfaceVsInterface;

public class Implementer implements InterfaceA, InterfaceB{
    //either you make this an abstract method which mean you have to make the class abstract too
//    abstract public void print();

    // or override/implement the print from interface B.
    @Override
    public void print() {
        System.out.println("Implementer");
    }
}
