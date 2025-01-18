package prob2.ducks;

import prob2.behaviours.implementations.CannotFly;
import prob2.behaviours.implementations.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }
}
