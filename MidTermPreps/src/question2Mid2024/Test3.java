package question2Mid2024;

public class Test3 {
    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new B();
        A o3 = o1;

        System.out.println(o1.getValue() + " O1 value before");
        System.out.println(o2.getValue() + " O2 value");
        o3.setValue(5);
        System.out.println(o3.getValue() + " O3 value after assigning value");
        System.out.println(o1.getValue() + " O1 value after");
        System.out.println(o2.getValue() + " O2 value");

        o1.print();
        o2.print();
        o3.print();
    }
}
