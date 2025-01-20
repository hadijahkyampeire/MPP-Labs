package constructorChanining;

public class Rectangle {
        private double length, width, diagonal;

        /**
         * Constructor #1:
         * Create a rectangle by specifying length and width.
         */
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
            this.diagonal = Math.sqrt(length * length + width * width);
        }

        /**
         * Use Static Factory Method to recall the constructor:
         * Create a rectangle by specifying width and the length of its diagonal.
         */
        public static Rectangle createRectangleFromDiagonal(double width, double diag) {
            double length = Math.sqrt(diag * diag - width * width);
            return new Rectangle(length, width);
        }

        /**
         * Computes and returns the area of the rectangle.
         */
        public double computeArea() {
            return length * width;
        }

}
