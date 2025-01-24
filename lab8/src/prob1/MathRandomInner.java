package prob1;

import java.util.function.Supplier;

public class MathRandomInner {

    // Inner class that implements Supplier<Double>
    class MathRandom implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

    public static void main(String[] args) {
        // class inner logic
        MathRandomInner mathRandomInner = new MathRandomInner();
        MathRandomInner.MathRandom innerClass = mathRandomInner.new MathRandom();
        System.out.println("Using inner class: " + innerClass.get());

        // anonymous inner class alternative
//        Supplier<Double> innerSupplier = new Supplier<Double>() {
//            @Override
//            public Double get() {
//                return Math.random();
//            }
//        };
//
//        // usage
//        System.out.println(innerSupplier.get());
    }
}