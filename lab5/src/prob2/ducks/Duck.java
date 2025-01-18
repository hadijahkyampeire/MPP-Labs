package prob2.ducks;

import prob2.behaviours.interfaces.FlyBehavior;
import prob2.behaviours.interfaces.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;


    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }

    public abstract void display();
}
