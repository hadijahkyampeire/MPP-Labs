package code.prob3.InheritanceA;

public class Main {
    public static void main(String[] args) {
        Cylinder c1 = new Circle(12.0);
        Cylinder c2 = new Cylinder(5.5, 10.0);
        Circle c3 = new Circle(11.0);

        System.out.println(c1.computeVolume()+ "Volume"); // Doesn't make sense
        System.out.println(c2.computeVolume() + "V2"); // okay
        System.out.println(c3.computeArea()+ "Area");


    }
}
