package interfaceClash.interfaceVsInterface;

public interface InterfaceB {
    default void print() {
        System.out.println("InterfaceB");
    }
}
