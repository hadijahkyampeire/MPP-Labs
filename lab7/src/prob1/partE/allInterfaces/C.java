package prob1.partE.allInterfaces;

public interface C extends A {
    default void method() {
        System.out.println("Method C");
    }
}
