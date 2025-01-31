package interfaceClash.interfaceVsInterface;

public interface InterfaceC extends InterfaceA, InterfaceB {
    // either you must provide a default method.
//    @Override
//    default void print() {
//        System.out.println("InterfaceC");
//    }

    //declare the method from interface A
    void print();
}
