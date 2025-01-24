package prob1.partE.allInterfaces;

public interface D extends B, C {

    @Override
    default void method() {
        System.out.println("D.method");
    }
}
