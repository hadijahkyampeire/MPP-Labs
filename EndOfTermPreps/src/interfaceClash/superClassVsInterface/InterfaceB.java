package interfaceClash.superClassVsInterface;

public interface InterfaceB {
//    void print();
    default void print() {
        System.out.println("InterfaceB");
    }
}
