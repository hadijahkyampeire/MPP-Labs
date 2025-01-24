package prob1.partE.allInterfaces;

public interface B extends A {
    default void method() {
        System.out.println("B method");
    }
}
