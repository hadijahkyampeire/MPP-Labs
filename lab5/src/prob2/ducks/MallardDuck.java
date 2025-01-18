package prob2.ducks;

import prob2.behaviours.implementations.FlyWithWings;
import prob2.behaviours.implementations.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
