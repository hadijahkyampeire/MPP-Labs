package prob1.partE.classInterface;

public interface C extends A {
    default public void method() {
        System.out.println("C.method");
    };
}
