public class BasicOperations {
    public static class Addition implements Operation {
        @Override
        public double execute(double a, double b) {
            return a + b;
        }
    }

    public static class Subtraction implements Operation {
        @Override
        public double execute(double a, double b) {
            return a - b;
        }
    }

    public static class Multiplication implements Operation {
        @Override
        public double execute(double a, double b) {
            return a * b;
        }
    }

    public static class Division implements Operation {
        @Override
        public double execute(double a, double b) {
            return a / b;
        }
    }
}
