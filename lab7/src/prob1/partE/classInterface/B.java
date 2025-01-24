package prob1.partE.classInterface;

public interface B extends A {
    public default void method() {
        System.out.println("B method");
    };
}
