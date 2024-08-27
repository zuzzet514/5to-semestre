public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
    public double calculate(int a, int b) {
        return operation.execute(a,b);
    }


}
