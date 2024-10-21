package pckg_calculator;

public abstract class Calculation {
    protected Operation operation;


    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void performCalculation(int a, int b) {
        float res = this.operation.performOperation(a,b);
        System.out.println("Result is: " + res);
    }
}
