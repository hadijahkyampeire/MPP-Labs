package positionHierarchy;

public class Main {
    public static void main(String[] args) {
        Position p1 = new Position("Lead Dev", true);
        Position p2 = new Position("Software Dev", false);

        System.out.println(p1 + "Manager position");
        System.out.println(p2 + "Non manager position");
    }
}
