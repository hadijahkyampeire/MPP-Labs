package prob2.behaviours.implementations;

import prob2.behaviours.interfaces.FlyBehavior;

public class CannotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
