package staticinherit;

public class Sub extends Super {
    public static void main(String[] args) {
        Supreme s1 = new Sub();
        Super s2 = new Sub();
        Sub s3 = new Sub();

        s1.print();
        s2.print();
        s3.print();
    }
}
