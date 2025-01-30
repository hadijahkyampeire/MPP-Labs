package part2.prob12;

import java.util.Optional;

public class OptionalLazySingleton {
    private static OptionalLazySingleton instance;
    private OptionalLazySingleton() {}

    public static OptionalLazySingleton getInstance() {
        instance = Optional.ofNullable(instance).orElseGet(OptionalLazySingleton::new);
        return instance;
    }

        public void showMessage() {
            System.out.println("Hello World!");
        }

    public static void main(String[] args) {
        OptionalLazySingleton singleton1 = OptionalLazySingleton.getInstance();
        singleton1.showMessage();

        OptionalLazySingleton singleton2 = OptionalLazySingleton.getInstance();
        System.out.println("Both instances are the same: " + (singleton1 == singleton2)); // Should print true
    }
}
