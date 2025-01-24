package prob4;

public class DecoyDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }

    @Override
    public void quack() {
        System.out.println("Cannot Quack");
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
