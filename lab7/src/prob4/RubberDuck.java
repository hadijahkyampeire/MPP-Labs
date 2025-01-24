package prob4;

public class RubberDuck extends Duck {

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }

    @Override
    public void quack() {
        System.out.println("Squeaking");
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
