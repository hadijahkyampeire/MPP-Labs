package prob2.ducks;

import prob2.behaviours.implementations.CannotFly;
import prob2.behaviours.implementations.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
