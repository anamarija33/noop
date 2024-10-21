package pckg_calculator;

public class Calculator {
    private int a;
    private int b;
    private Calculation calculation;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
        calculation.setOperation(new Add());
    }
    public void setFirstNumber(int num){
        this.a = num;
    }
    public int getFirstNumber(){
        return a;
    }
    public void setSecondNumber(){

    }
    public void getSecondNumber(){

    }
    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public void performCalculation(){
        calculation.performCalculation(a,b);
    }
}

